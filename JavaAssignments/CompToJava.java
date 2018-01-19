package com.target.conversion;

import com.indexoutofbounds.mainframe.converter.MainFrameGlobals;
import com.indexoutofbounds.mainframe.exception.MainFrameConversionException;

public class CompToJava {

	public static char SIGN_POS = 0xC;
	public static char SIGN_NEG = 0xD;
	public static char SIGN_UNSIGNED = 0x0F;

	public static byte HEX_NEG = 0x0D;
	public final static int DOUBLE_PRECISION_LIMIT = 308;
	public final static int PACKED_BYTE_MAX_VALUE = 153;
	protected final static int STRICT_TRANSLATION = 0;

	/**
	 * Low nybble mask value, 0000 1111
	 */
	public static final byte LOW_NYBBLE_MASK = 0x0F;

	/**
	 * High nybble mask value, 1111 0000
	 */
	public static final int HIGH_NYBBLE_MASK = 0xF0;

	public static final int HIGH_NYBBLE = 0;
	public static final int LOW_NYBBLE = 1;

	public static final double convertCOMP3ToDouble(byte[] buffer, int scale) throws MainFrameConversionException {

		// check for sign.
		int signum = digOutSignMultiplierLowNybble(buffer[buffer.length - 1]);

		if (determinePrecision(buffer.length) > DOUBLE_PRECISION_LIMIT) {
			throw new MainFrameConversionException(MainFrameGlobals.COBOLConversionUtils_NumberSizeMessage);
		}

		return signum * packedNybblesToDouble(buffer) / Math.pow(10, scale);
	}

	protected static int digOutSignMultiplierLowNybble(byte signbit) throws MainFrameConversionException {

		return (isNegativeLowNybbleSignBit(signbit)) ? -1 : 1;
	}

	protected static boolean isNegativeLowNybbleSignBit(byte signbit) throws MainFrameConversionException {

		int sign = digOutLowNybbleValue(signbit);

		if (!checkSign(sign)) {
			throw new MainFrameConversionException(MainFrameGlobals.COBOLConversionUtils_SignBit + ": " + sign);
		}

		return (sign == HEX_NEG);
	}

	protected static int digOutLowNybbleValue(byte b) {

		return (b & LOW_NYBBLE_MASK);
	}

	protected static boolean checkSign(int signbit) {

		return (signbit == SIGN_POS || signbit == SIGN_NEG || signbit == SIGN_UNSIGNED || signbit == 0);
	}

	protected static int determinePrecision(int arrayLength) {

		return (arrayLength * 2) - 1;
	}

	private static final double packedNybblesToDouble(byte[] buffer) throws MainFrameConversionException {

		double value = 0;

		for (int i = 0; i < buffer.length - 1; i++) {

			int[] cbyte = unpackCOMP3Byte(buffer[i]);
			// We multiply by 10 to advance the number to the next order of
			// magnitude
			// in terms of one, tens, hundreds, thousands, etc
			value = value * 10 + cbyte[0];
			value = value * 10 + cbyte[1];
		}

		// We skip this value in the loop b/c the sign-bit will throw off the
		// check.
		// The signbit is checked for validity elsewhere.
		value = value * 10 + digOutHighNybbleValue(buffer[buffer.length - 1]);

		return value;
	}

	private static int[] unpackCOMP3Byte(byte b) throws MainFrameConversionException {

		if (b > PACKED_BYTE_MAX_VALUE) {
			throw new MainFrameConversionException(MainFrameGlobals.COBOLConversionUtils_ByteLengthTooLarge);
		}

		int[] cbyte = bustByteIntoNybbles(b);

		if (STRICT_TRANSLATION != 0) {
			// TODO check this
			if (cbyte[0] > 9 || cbyte[1] > 9)
				throw new MainFrameConversionException(
						MainFrameGlobals.COBOLConversionUtils_COMP3_Value + " [" + cbyte[0] + ":" + cbyte[1] + "]");
		}
		return cbyte;
	}

	protected static int digOutHighNybbleValue(byte b) {

		return (b & HIGH_NYBBLE_MASK) >>> 4;
	}

	protected static int[] bustByteIntoNybbles(byte b) {

		// 1 byte = 2 nybbles, 1 nybble = 4 bits.
		int[] ubyte = new int[2];

		ubyte[HIGH_NYBBLE] = digOutHighNybbleValue(b);
		ubyte[LOW_NYBBLE] = digOutLowNybbleValue(b);

		return ubyte;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "-167812D";

		byte[] byte1 = str.getBytes();
		// CompToJava ctj = new CompToJava();
		try {
			CompToJava.convertCOMP3ToDouble(byte1, 2);
		} catch (MainFrameConversionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
