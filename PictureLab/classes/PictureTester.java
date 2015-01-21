/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }
    
    /** Method to test zeroRed */
    public static void testZeroRed()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroRed();
        beach.explore();
    }
    
    /** Method to test zeroGreen */
    public static void testZeroGreen()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroGreen();
        beach.explore();
    }

    /** Method to test keepOnlyBlue */
    public static void testKeepOnlyBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.keepOnlyBlue();
        beach.explore();
    }

    /** Method to test negate */
    public static void testNegate()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.negate();
        beach.explore();
    }

    /** Method to test grayscale */
    public static void testGrayscale()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.grayscale();
        beach.explore();
    }

    /**Method to test sepia */
    public static void testSepia()
    {
        //does not work
        Picture beach = new Picture("temple.jpg");
        beach.explore();
        beach.sepia();
        beach.explore();
    }

    /** Method to test fixUnderwater */
    public static void testFixUnderwater()
    {
        Picture water = new Picture("water.jpg");
        water.explore();
        water.fixUnderwater();
        water.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /** Method to test mirrorVerticalRightToLeft */
    public static void testMirrorVerticalRightToLeft()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVerticalRightToLeft();
        caterpillar.explore();
    }

    /** Method to test mirrorHorizontal */
    public static void testMirrorHorizontal()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
    }

    /** Method to test mirrorHorizontalBottomTop */
    public static void testMirrorHorizontalBottomTop()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontalBottomTop();
        caterpillar.explore();
    }

    /** Method to test mirrorDiagonal */
    public static void testMirrorDiagonal()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorDiagonal();
        caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorArms()
    {
        Picture snowman = new Picture("snowman.jpg");
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorGull()
    {
        Picture seagull = new Picture("seagull.jpg");
        seagull.explore();
        seagull.mirrorGull();
        seagull.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    ///** Method to test cropAndCopy */
    //public static void testCropAndCopy()
    //{
    //   Picture seagull = new Picture("seagull.jpg");
    //  Picture beach = new Picture("beach.jpg");
    //  seagull.explore();
    //  seagull.cropAndCopy(beach, 0, beach.getWidth(), 0, beach.getHeight(), seagull.getWidth(),
    //                      seagull.getHeight());
    //  seagull.explore();
    //}

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroRed();
        testZeroGreen();
        testSepia();
        //testZeroBlue();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorVerticalRightToLeft();
        //testMirrorHorizontal();
        //testMirrorHorizontalBottomTop();
        //testMirrorDiagonal();
        //testMirrorArms();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
        //testCropAndCopy();
    }
}