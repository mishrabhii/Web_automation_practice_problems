//package com.bridgelabz.test;
//
//import java.awt.Robot;
//import java.util.zip.ZipFile;
//
//public class UploadFile {
//	 java.awt.datatransfer.StringSelection StringSelection = new java.awt.datatransfer.StringSelection(ZipFile.getAbsolutePath());
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(StringSelection, null);
//
//	    driver.switchTo().window(driver.getWindowHandle());
//
//	    Robot robot = new Robot();
//
//	    //Open Goto window
//	    robot.keyPress(KeyEvent.VK_META);
//	    robot.keyPress(KeyEvent.VK_SHIFT);
//	    robot.keyPress(KeyEvent.VK_G);
//	    robot.keyRelease(KeyEvent.VK_META);
//	    robot.keyRelease(KeyEvent.VK_SHIFT);
//	    robot.keyRelease(KeyEvent.VK_G);
//
//	    //Paste the clipboard value
//	    robot.keyPress(KeyEvent.VK_META);
//	    robot.keyPress(KeyEvent.VK_V);
//	    robot.keyRelease(KeyEvent.VK_META);
//	    robot.keyRelease(KeyEvent.VK_V);
//
//	    //Press Enter key to close the Goto window and Upload window
//	    robot.delay(1000);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//	    robot.delay(1000);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//}
//}
