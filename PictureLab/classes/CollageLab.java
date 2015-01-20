
/**
 * Creates a collage
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollageLab
{
    /**
     * the main method that runs the entire collage
     * 
     * @pre        all methods
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        Picture original = new Picture("blueMotorcycle.jpg");
        Picture finalPic = new Picture(960,1920);
        finalPic.copy(original,0,0);
        
        Picture change1 = new Picture("blueMotorcycle.jpg");
        change1.zeroBlue();
        change1.negate();
        finalPic.copy(change1,480,0);
        
        Picture change2 = new Picture("blueMotorcycle.jpg");
        change2.zeroRed();
        change2.negate();
        finalPic.copy(change2,0,640);
        
        Picture change3 = new Picture("blueMotorcycle.jpg");
        change3.zeroGreen();
        change3.negate();
        finalPic.copy(change3,480,640);
        
        Picture change4 = new Picture("blueMotorcycle.jpg");
        change4.mirrorHorizontal();
        change4.grayscale();
        finalPic.copy(change4,0,1280);
        
        Picture change5 = new Picture("blueMotorcycle.jpg");
        change5.mirrorVertical();
        change5.negate();
        finalPic.copy(change5,480,1280);
        
        finalPic.explore();
        finalPic.write("H:\\GitHub\\unit6MediaComp\\PictureLab\\classes\\MyCollage.jpg");
    }
}
