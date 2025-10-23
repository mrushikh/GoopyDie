import java.awt.AWTException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.concurrent.TimeUnit;


public class input {

    
    
    public static Color customColor = new Color(65, 145, 215);//blue
    public static Color customColor1 = new Color(66, 146, 216);//blue
    public static Color customColor2 = new Color(65, 147, 218);//blue
    public static Color customColor3 = new Color(63, 144, 216);//blue
    public static Color outlineColor = new Color(11, 14, 109);//blue
    public static Color highliteColor = new Color(11, 14, 109);//blue

    // phase3 grays
    // public static Color customColor4 = new Color(148, 150, 142);//gray
    // public static Color customColor5 = new Color(144, 142, 143);//gray
    //you win screen yellow text
    // public static Color customColor4 = new Color(254, 204, 67);//gray
    // public static Color customColor5 = new Color(255, 206, 66);//gray

    // public static Color customColor6 = new Color(159, 116, 85);//brown
    // public static Color customColor7 = new Color(145, 93, 59);//brown
    // ||mycolor.equals(customColor4)
    //             ||mycolor.equals(customColor5)||mycolor.equals(customColor6)||mycolor.equals(customColor7)

    public static boolean colorCheck(Color colo) throws AWTException{
        int red=colo.getRed();
        int blue=colo.getBlue();
        int green=colo.getGreen();
        boolean result=false;
        if ((50<red&&80>red)&&(130<green&&160 >green)&&(200<blue&&240>blue)) {
           result=true;
           
            
        }
        return result;
    }
   
    public static boolean colorPink() throws AWTException{
        int y=1080;
        int x=1920;
        int h=0;
        int w=0;
        boolean exist=false;
        int result=0;    
        Robot robot1=new Robot();
        Rectangle rec=new Rectangle();
        Color mycolor =null;
        rec=new Rectangle(x,y);
        BufferedImage img=robot1.createScreenCapture(rec);
         for(h=1079;h>0;h--){
            for(w=0;w<1920;w++){
                mycolor = new Color(img.getRGB(w,h));
                int bl=mycolor.getBlue();
                int gr=mycolor.getGreen();
                int re=mycolor.getRed();
                if((bl>164&&bl<213)&&(gr>146&&gr<207)&&(re<254&&re>242)){
                    
                    String ret=w+" ";
                    result++;
                    if (result>2000) {
                        exist=true;
                        break;
                    }
                    
                }
                // if(mycolor.equals(customColor)||mycolor.equals(customColor1)||mycolor.equals(customColor2)||mycolor.equals(customColor3)){
                //     exist=true;
                //     String ret=w+" ";
                //     result=ret;
                //     break;
                // }
                

            }
        }
        
        
        // System.out.println(result);
        return exist;
    }

    public static boolean winYell() throws AWTException{
        int y=1080;
        int x=1920;
        int h=0;
        int w=0;
        boolean exist=false;
        int result=0;    
        Robot robot1=new Robot();
        Rectangle rec=new Rectangle();
        Color mycolor =null;
        rec=new Rectangle(x,y);
        BufferedImage img=robot1.createScreenCapture(rec);
         for(h=1079;h>0;h--){
            for(w=0;w<1920;w++){
                mycolor = new Color(img.getRGB(w,h));
                int bl=mycolor.getBlue();
                int gr=mycolor.getGreen();
                int re=mycolor.getRed();
                if((bl>60&&bl<70)&&(gr>200&&gr<210)&&(re<260&&re>250)){
                    
                    String ret=w+" ";
                    result++;
                    if (result>3000) {
                        exist=true;
                        // break;
                    }
                    
                }
                // if(mycolor.equals(customColor)||mycolor.equals(customColor1)||mycolor.equals(customColor2)||mycolor.equals(customColor3)){
                //     exist=true;
                //     String ret=w+" ";
                //     result=ret;
                //     break;
                // }
                

            }
        }
        
        
        // System.out.println(result);
        return exist;
    }
    
    public static boolean colorGrey() throws AWTException{
        int y=1080;
        int x=1920;
        int h=0;
        int w=0;
        boolean exist=false;
        int result=0;    
        Robot robot1=new Robot();
        Rectangle rec=new Rectangle();
        Color mycolor =null;
        rec=new Rectangle(x,y);
        BufferedImage img=robot1.createScreenCapture(rec);
         for(h=1079;h>0;h--){
            for(w=0;w<1920;w++){
                mycolor = new Color(img.getRGB(w,h));
                int bl=mycolor.getBlue();
                int gr=mycolor.getGreen();
                int re=mycolor.getRed();
                if((bl>140&&bl<150)&&(gr>140&&gr<150)&&(re<150&&re>140)){
                    
                    String ret=w+" ";
                    result++;
                    if (result>1000) {
                        exist=true;
                        break;
                    }
                    
                }
                // if(mycolor.equals(customColor)||mycolor.equals(customColor1)||mycolor.equals(customColor2)||mycolor.equals(customColor3)){
                //     exist=true;
                //     String ret=w+" ";
                //     result=ret;
                //     break;
                // }
                

            }
        }
        
       
        // System.out.println(result);
        return exist;
    }
    public static  boolean whereGreyLeft() throws AWTException{
        int y=1080;
        int x=960;
        int h=0;
        int w=0;
        boolean exist=false;
        int result=0;    
        Robot robot1=new Robot();
        Rectangle rec=new Rectangle();
        Color mycolor =null;
        rec=new Rectangle(x,y);
        BufferedImage img=robot1.createScreenCapture(rec);
         for(h=1079;h>0;h--){
            for(w=0;w<960;w++){
                mycolor = new Color(img.getRGB(w,h));
                int bl=mycolor.getBlue();
                int gr=mycolor.getGreen();
                int re=mycolor.getRed();
                if((bl>135&&bl<155)&&(gr>135&&gr<155)&&(re<155&&re>135)){
                    
                    String ret=w+" ";
                    result++;
                    if (result>5000) {
                        exist=true;
                        break;
                     }
                    
                }
                // if(mycolor.equals(customColor)||mycolor.equals(customColor1)||mycolor.equals(customColor2)||mycolor.equals(customColor3)){
                //     exist=true;
                //     String ret=w+" ";
                //     result=ret;
                //     break;
                // }
                

            }
        }
        
        
        // System.out.println(result);
        return exist;
        
        
    }
    public static  String whereNose1() throws AWTException{
         int y=1080;
        int x=1920;
        int h=0;
        int w=0;
        boolean exist=false;
        boolean result=false;    
        Robot robot1=new Robot();
        Rectangle rec=new Rectangle();
        Color mycolor =null;
        rec=new Rectangle(x,y);
        BufferedImage img=robot1.createScreenCapture(rec);
        for(h=1079;h>600;h--){
            for(w=0;w<100;w++){
                
                mycolor = new Color(img.getRGB(w,h));
                if(mycolor.equals(customColor)||mycolor.equals(customColor1)||mycolor.equals(customColor2)||mycolor.equals(customColor3)){
                    exist=true;
                    int ret=w;
                    result=true;
                    return mycolor.toString();
                    // break;
                }
                

            }
        }
        // String rem="dne";
        // if(!exist){
        //     result="not detected";
        // }else{
        //     result="detected";
        // }
        
        return "1";
        
        
    }
    public static boolean colorAt(int a, int b,int con) throws AWTException{
        int y=1080;
        int x=1920;
        int h=0;
        int w=0;
        int ret=0;
        boolean exist=false;
        boolean result=false;    
        Robot robot1=new Robot();
        Rectangle rec=new Rectangle();
        Color mycolor =null;
        rec=new Rectangle(x,y);
        BufferedImage img=robot1.createScreenCapture(rec);
        for(h=800;h>b;h--){
            for(w=0;w<a;w++){
                
                mycolor = new Color(img.getRGB(w,h));
                if(colorCheck(mycolor)){
                    exist=true;
                    ret++;
                    
                  
                }
                if (ret>con) {
                result=true;

                break;
                }
                
                

            }
        }
        // String rem="dne";
        // if(!exist){
        //     result="not detected";
        // }else{
        //     result="detected";
        // }
        
        // System.out.println(ret);
        return result;
        
    }
    
    public static void openAndStart() throws AWTException, InterruptedException{
        Robot robot = new Robot();
        
        // robot.mouseMove(580, 1070);
        // robot.mousePress(InputEvent.BUTTON1_MASK);
        // robot.mouseRelease(InputEvent.BUTTON1_MASK);
        // robot.delay(1000);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_UP);
        robot.delay(500);
        robot.keyRelease(KeyEvent.VK_UP);
        robot.keyPress(KeyEvent.VK_Z);
        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_Z);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_Z);
        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_Z);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.delay(1300);
        robot.keyRelease(KeyEvent.VK_LEFT);
        start();
    }
    public static void retry() throws AWTException{
        Robot robot = new Robot();
        
        robot.mouseMove(580, 1070);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_Z);
        robot.delay(500);
        robot.keyRelease(KeyEvent.VK_Z);
        robot.delay(500);
        
    }
    public static void openAndStart1() throws AWTException{
        Robot robot = new Robot();
        
        robot.mouseMove(620, 1070);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
    }

    public static void phase1() throws AWTException, InterruptedException{
        Robot ph1=new Robot();
        boolean onRight= false;
        
        ph1.keyPress(KeyEvent.VK_X);
        ph1.delay(2000);
        ph1.keyPress(KeyEvent.VK_LEFT);
        ph1.delay(1300);
        ph1.keyRelease(KeyEvent.VK_LEFT);
        ph1.keyPress(KeyEvent.VK_DOWN);
        while (true) {
             if (colorPink()) {
                ph1.keyRelease(KeyEvent.VK_DOWN);
                // ph1.keyPress(KeyEvent.VK_LEFT);
                // ph1.delay(5);
                // ph1.keyRelease(KeyEvent.VK_LEFT);
                // ph1.keyPress(KeyEvent.VK_SHIFT);
                // ph1.keyRelease(KeyEvent.VK_SHIFT);
                // ph1.delay(5 );
                System.out.println("it broke");
                break; 
               
             }

            if (colorAt(250,500,10)==true&&onRight==false) {
                onRight=true;
                // System.out.println("yes");
                ph1.keyPress(KeyEvent.VK_RIGHT);
                ph1.delay(1);
                ph1.keyRelease(KeyEvent.VK_RIGHT);
                ph1.keyPress(KeyEvent.VK_SHIFT);
                ph1.keyRelease(KeyEvent.VK_SHIFT);
                // ph1.delay(750); 
                
                TimeUnit.MILLISECONDS.sleep(500);
                
                // TimeUnit.SECONDS.sleep(1);   
                
            }

            if (colorAt(250,500,2)==false&&onRight==true) {
                onRight=false;
                ph1.keyPress(KeyEvent.VK_LEFT);
                ph1.delay(1);
                ph1.keyRelease(KeyEvent.VK_LEFT);
                ph1.keyPress(KeyEvent.VK_SHIFT);
                ph1.keyRelease(KeyEvent.VK_SHIFT);
                
                TimeUnit.MILLISECONDS.sleep(500);
                
            }
            
            // System.out.println(onRight);
        }
                            
                            
            
        }

    

    public static void phase1a() throws AWTException, InterruptedException{
        Robot ph1a=new Robot();
        boolean onRighta= false;
        
        ph1a.keyPress(KeyEvent.VK_RIGHT);
        ph1a.delay(200);
        ph1a.keyRelease(KeyEvent.VK_RIGHT);
        ph1a.keyPress(KeyEvent.VK_LEFT);
        ph1a.delay(1);
        ph1a.keyRelease(KeyEvent.VK_LEFT);
        ph1a.keyPress(KeyEvent.VK_DOWN);
        while (true) {
            boolean there=colorAt(250,300,20);
            boolean isThere=colorAt(300,300,10);
             if (colorGrey()) {
                System.out.println("it broke part 2 electric boogaloo");
                break;
               
             }

            if (there==true&&onRighta==false) {
                onRighta=true;
                // System.out.println("yes");
                            
                ph1a.keyPress(KeyEvent.VK_RIGHT);
                ph1a.delay(1);
                ph1a.keyRelease(KeyEvent.VK_RIGHT);
                ph1a.keyPress(KeyEvent.VK_SHIFT);
                ph1a.keyRelease(KeyEvent.VK_SHIFT);
                // ph1a.delay(1000); 
                
                TimeUnit.MILLISECONDS.sleep(500);   
                
            }

            if (isThere==false&&onRighta==true) {
                onRighta=false;
                ph1a.keyPress(KeyEvent.VK_LEFT);
                ph1a.delay(1);
                ph1a.keyRelease(KeyEvent.VK_LEFT);
                ph1a.keyPress(KeyEvent.VK_SHIFT);
                ph1a.keyRelease(KeyEvent.VK_SHIFT);
                // ph1a.delay(1000); 
                onRighta=false;
                TimeUnit.MILLISECONDS.sleep(500);    
                
            }
            
            
        }
                            
        

            
                
            
    }

    public static void phase2() throws AWTException, InterruptedException{
        Robot ph2=new Robot();
        ph2.keyPress(KeyEvent.VK_RIGHT);
        ph2.delay(50);
        ph2.keyRelease(KeyEvent.VK_RIGHT);
        ph2.delay(500);
        ph2.keyRelease(KeyEvent.VK_DOWN);
        ph2.keyPress(KeyEvent.VK_TAB);
        ph2.keyRelease(KeyEvent.VK_TAB);
        ph2.delay(2500);
        ph2.keyPress(KeyEvent.VK_V);
        ph2.keyRelease(KeyEvent.VK_V);
        
        ph2.delay(4850);
        // ph2.keyPress(KeyEvent.VK_TAB);
        // ph2.keyRelease(KeyEvent.VK_TAB);
        while (true) {
                
                // System.out.println("ph2");    
                
                ph2.keyPress(KeyEvent.VK_RIGHT);
                // ph2.keyPress(KeyEvent.VK_Z);
                // ph2.delay(5);
                // ph2.keyRelease(KeyEvent.VK_Z);
                // ph2.delay(50);
                
                ph2.keyPress(KeyEvent.VK_SHIFT);
                ph2.keyRelease(KeyEvent.VK_SHIFT);
                // ph2.delay(500);
                // ph2.keyPress(KeyEvent.VK_SHIFT);
                // ph2.keyRelease(KeyEvent.VK_SHIFT);
                ph2.delay(1500); 
                ph2.keyRelease(KeyEvent.VK_RIGHT);

                ph2.keyPress(KeyEvent.VK_LEFT);
                // ph2.keyPress(KeyEvent.VK_Z);
                // ph2.delay(5);
                // ph2.keyRelease(KeyEvent.VK_Z);
                // ph2.delay(50);
                
                ph2.keyPress(KeyEvent.VK_SHIFT);
                ph2.keyRelease(KeyEvent.VK_SHIFT);
                // ph2.delay(500);
                // ph2.keyPress(KeyEvent.VK_SHIFT);
                // ph2.keyRelease(KeyEvent.VK_SHIFT);
                ph2.delay(1500); 
                ph2.keyRelease(KeyEvent.VK_LEFT);

                
                
                // TimeUnit.SECONDS.sleep(1);   
                
            }

            
                
                
            
            
            
     }
    
    public static void phase2a() throws AWTException, InterruptedException{
        Robot ph2=new Robot();
        boolean oRight=false;
        ph2.keyPress(KeyEvent.VK_RIGHT);
        ph2.delay(50);
        ph2.keyRelease(KeyEvent.VK_RIGHT);
        
        ph2.keyRelease(KeyEvent.VK_DOWN);
        ph2.keyPress(KeyEvent.VK_TAB);
        ph2.keyRelease(KeyEvent.VK_TAB);
        
        ph2.keyPress(KeyEvent.VK_V);
        ph2.keyRelease(KeyEvent.VK_V);
        
        ph2.delay(4000);
        // ph2.keyPress(KeyEvent.VK_TAB);
        // ph2.keyRelease(KeyEvent.VK_TAB);
        while (true) {
                if (winYell()) {
                    // System.out.println("yell");
                    break;
                }
                 if (colorGrey()) {
                    System.out.println("gre");
                    
                }
                
                if (whereGreyLeft()) {
                    
                    ph2.keyRelease(KeyEvent.VK_LEFT);
                    ph2.keyPress(KeyEvent.VK_RIGHT);
                // ph2.keyPress(KeyEvent.VK_Z);
                // ph2.delay(5);
                // ph2.keyRelease(KeyEvent.VK_Z);
                // ph2.delay(50);
                    if (oRight==false) {
                        ph2.keyPress(KeyEvent.VK_SHIFT);
                        ph2.keyRelease(KeyEvent.VK_SHIFT);
                    }
                    
                // ph2.delay(500);
                // ph2.keyPress(KeyEvent.VK_SHIFT);
                // ph2.keyRelease(KeyEvent.VK_SHIFT);
                    ph2.delay(300); 
                    
                    oRight=true;
                }else{
                    ph2.keyRelease(KeyEvent.VK_RIGHT);
                    ph2.keyPress(KeyEvent.VK_LEFT);
                    if (oRight==true) {
                        ph2.keyPress(KeyEvent.VK_SHIFT);
                        ph2.keyRelease(KeyEvent.VK_SHIFT);
                    }
                    oRight=false;
                 
                
                }
            }

            
                
                
            
            
            
     }
        
    public static void start() throws AWTException, InterruptedException{
        Robot ph2=new Robot();
        ph2.keyPress(KeyEvent.VK_LEFT);
        ph2.delay(500);
        ph2.keyRelease(KeyEvent.VK_LEFT);
        
        ph2.keyPress(KeyEvent.VK_SHIFT);
        ph2.keyRelease(KeyEvent.VK_SHIFT);
        retry();
        // openAndStart();
        phase1();
        System.out.println("it over");
        phase1a();
        System.out.println("it over again");
        phase2a();
        System.out.println("end");
        ph2.keyRelease(KeyEvent.VK_RIGHT);
        ph2.keyRelease(KeyEvent.VK_LEFT);
        ph2.keyRelease(KeyEvent.VK_X);

        while (true) {
            
            if (winYell()) {
                System.out.println("won");
                winYell();
                TimeUnit.SECONDS.sleep(10);
                ph2.keyRelease(KeyEvent.VK_Z);
                ph2.keyPress(KeyEvent.VK_Z);
                ph2.keyRelease(KeyEvent.VK_Z);
                ph2.keyPress(KeyEvent.VK_Z);
                ph2.keyRelease(KeyEvent.VK_Z);
                ph2.keyPress(KeyEvent.VK_Z);
                TimeUnit.SECONDS.sleep(7);
                // ph2.keyPress(KeyEvent.VK_SHIFT);
                // ph2.keyRelease(KeyEvent.VK_SHIFT);
                System.out.println("startin");
                ph2.keyPress(KeyEvent.VK_UP);
                ph2.delay(500);
                ph2.keyRelease(KeyEvent.VK_UP);
                ph2.keyPress(KeyEvent.VK_Z);
                ph2.delay(100);
                ph2.keyRelease(KeyEvent.VK_Z);
                ph2.delay(100);
                ph2.keyPress(KeyEvent.VK_Z);
                ph2.delay(100);
                ph2.keyRelease(KeyEvent.VK_Z);
                ph2.delay(100);
                // ph2.keyPress(KeyEvent.VK_LEFT);
                // ph2.delay(1300);
                // ph2.keyRelease(KeyEvent.VK_LEFT);
                System.out.println("fini");
                TimeUnit.MILLISECONDS.sleep(3000);
                start();
            }
        }

       
        // if (checkWin()) {
            
        //     openAndStart();
        //     System.out.println("startin");
        //     // ph2.keyPress(KeyEvent.VK_ESCAPE);
        //     // ph2.keyRelease(KeyEvent.VK_ESCAPE);
        //     // ph2.keyPress(KeyEvent.VK_DOWN);
        //     // ph2.keyRelease(KeyEvent.VK_DOWN);
            
        // }
     }
            
                
   public static boolean checkWin() throws AWTException{
        boolean result=false;
        while (true) {
            if (winYell()) {
                result=true;
                break;
            }
        }
    
    
        return result;
   }         
    
              
   public static void main(String[] args) throws AWTException, InterruptedException{
        Robot ph2=new Robot();
        start();
        
        // retry();
        // // openAndStart();
        // phase1();
        // System.out.println("it over");
        // phase1a();
        // System.out.println("it over again");
        // phase2a();
        // System.out.println("end");
        
        
    
        // while (true) {
        //     System.out.println(whereGuy());
        // }
        
      

       
    
       
       
       
       
      
    //    System.out.println(whereNose1(0,0,0)+" black");
    //    System.out.println(whereNose1(190, 5, 5)+" green");
    //    System.out.println(whereNose1(186, 1, 1)+" red");
    //    System.out.println(whereNose1(255, 201, 14)+" yellow");
    //    System.out.println(colorAt(960, 540));

       
        
    }
}