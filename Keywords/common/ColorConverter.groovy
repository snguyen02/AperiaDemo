package common

class ColorConverter {
	
	    public static String convertRGBA2Hex(String backgroundColor) {
        String[] hexValue = backgroundColor.split("[, rgba()]+");
        int hexValue1 = Integer.parseInt(hexValue[1]);
        int hexValue2 = Integer.parseInt(hexValue[2]);
        int hexValue3 = Integer.parseInt(hexValue[3]);
        String result = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
        return result.toUpperCase();
    }
}