package execution;



import object.ObjectModel;
import static utilities.Utils.getCell;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.KinPage;
import utilities.Config;
import utilities.Driver;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestingClass {
    public KinPage pages = new KinPage();

    public static List<ObjectModel> allData = new ArrayList<ObjectModel>() ;

    @BeforeMethod
    public void setPages(){

        Driver.getDriver().get(Config.getProperty("path"));

    }

    @AfterClass
    public void closeDriver(){Driver.closeDriver();}

    @Test (priority = 0)
    public void testOne() throws Exception {
        ObjectModel objectModel1 = new ObjectModel();

        pages.nameFieldInput.clear();
        pages.nameFieldInput.sendKeys(getCell(1, 0));

        pages.titleInput.clear();
        pages.titleInput.sendKeys(getCell(1, 1));

        pages.authorInput.clear();
        pages.authorInput.sendKeys(getCell(1, 2));


        pages.pagesInput.clear();
        pages.pagesInput.sendKeys(getCell(1, 3));
        String num = getCell(1, 3);

        objectModel1.setPages(Integer.parseInt(num.substring(0, num.length() - 2)));


        pages.dDSInput.clear();
        pages.dDSInput.sendKeys(getCell(1, 4));
        objectModel1.setDDSNum(getCell(1, 4).substring(0, 3));



        Select selectRead = new Select(pages.dropRead);

        selectRead.selectByIndex(0);
        objectModel1.setRead((int)objectModel1.getPages());

            Select selectTime = new Select(pages.dropDownWeek);
            selectTime.selectByIndex(1);

            Select selectStar = new Select(pages.dropStar);
            selectStar.getFirstSelectedOption();

        /* here should be assertion for checking about new element appear as input but i have no idea how to create function with JS
            so in this case i create a objectClass class as the place to store all data that we need.
        */
            objectModel1.setReadOrNot(true);
            allData.add(objectModel1);
        }

    @Test (priority = 1)
    public void testTwo() throws Exception {
        ObjectModel objectModel2 = new ObjectModel();

        pages.nameFieldInput.clear();
        pages.nameFieldInput.sendKeys(getCell(2, 0));

        pages.titleInput.clear();
        pages.titleInput.sendKeys(getCell(2, 1));

        pages.authorInput.clear();
        pages.authorInput.sendKeys(getCell(2, 2));


        pages.pagesInput.clear();
        pages.pagesInput.sendKeys(getCell(2, 3));
        String num = getCell(2, 3);

        objectModel2.setPages(Integer.parseInt(num.substring(0, num.length() - 2))/2);


        pages.dDSInput.clear();
        pages.dDSInput.sendKeys(getCell(2, 4));
        objectModel2.setDDSNum(getCell(2, 4).substring(0, 3));



        Select selectRead = new Select(pages.dropRead);

        selectRead.selectByIndex(1);
        objectModel2.setRead((int)objectModel2.getPages()/2);

        Select selectTime = new Select(pages.dropDownWeek);
        selectTime.selectByIndex(1);

        Select selectStar = new Select(pages.dropStar);
        selectStar.getFirstSelectedOption();
        objectModel2.setReadOrNot(true);
        /* here should be assertion for checking about new element appear as input but i have no idea how to create function with JS
            so in this case i create a objectClass class as the place to store all data that we need.
        */
        allData.add(objectModel2);
    }

    @Test (priority = 2)
    public void testThree() throws Exception {
        ObjectModel objectModel3 = new ObjectModel();

        pages.nameFieldInput.clear();
        pages.nameFieldInput.sendKeys(getCell(3, 0));

        pages.titleInput.clear();
        pages.titleInput.sendKeys(getCell(3, 1));

        pages.authorInput.clear();
        pages.authorInput.sendKeys(getCell(3, 2));


        pages.pagesInput.clear();
        pages.pagesInput.sendKeys(getCell(3, 3));
        String num = getCell(3, 3);

        objectModel3.setPages(Integer.parseInt(num.substring(0, num.length() - 2)));
        System.out.println(objectModel3.getPages());

        pages.dDSInput.clear();
        pages.dDSInput.sendKeys(getCell(3, 4));
        objectModel3.setDDSNum(getCell(3, 4).substring(0, 3));
        System.out.println(objectModel3.getDDSnum());


        Select selectRead = new Select(pages.dropRead);

        selectRead.selectByIndex(0);
        objectModel3.setRead((int)objectModel3.getPages());

        Select selectTime = new Select(pages.dropDownWeek);
        selectTime.selectByIndex(0);

        Select selectStar = new Select(pages.dropStar);
        selectStar.getFirstSelectedOption();
        objectModel3.setReadOrNot(true);
        /* here should be assertion for checking about new element appear as input but i have no idea how to create function with JS
            so in this case i create a objectClass class as the place to store all data that we need.
        */
        allData.add(objectModel3);
    }

    @Test (priority = 3)
    public void testFour() throws Exception {
        ObjectModel objectModel4 = new ObjectModel();

        pages.nameFieldInput.clear();
        pages.nameFieldInput.sendKeys(getCell(4, 0));

        pages.titleInput.clear();
        pages.titleInput.sendKeys(getCell(4, 1));

        pages.authorInput.clear();
        pages.authorInput.sendKeys(getCell(4, 2));


        pages.pagesInput.clear();
        pages.pagesInput.sendKeys(getCell(4, 3));
        String num = getCell(4, 3);

        objectModel4.setPages(0);
        System.out.println(objectModel4.getPages());

        pages.dDSInput.clear();
        pages.dDSInput.sendKeys(getCell(4, 4));
        objectModel4.setDDSNum(getCell(4, 4).substring(0, 3));
        System.out.println(objectModel4.getDDSnum());


        Select selectRead = new Select(pages.dropRead);

        selectRead.selectByIndex(0);
        objectModel4.setRead((int)objectModel4.getPages());

        Select selectTime = new Select(pages.dropDownWeek);
        selectTime.selectByIndex(1);

        Select selectStar = new Select(pages.dropStar);
        selectStar.getFirstSelectedOption();

        /* here should be assertion for checking about new element appear as input but i have no idea how to create function with JS
            so in this case i create a objectClass class as the place to store all data that we need.
        */
        objectModel4.setReadOrNot(false);
        allData.add(objectModel4);
    }

    @Test (priority = 4)
    public void ResultTest() throws Exception {

        int totalPagesReaded = 0;
        for(ObjectModel data : allData){
            totalPagesReaded += data.getPages();
        }
        System.out.println(totalPagesReaded);
        String expected = getCell(9,1);
        Assert.assertEquals(String.valueOf(totalPagesReaded),expected.substring(0,expected.length()-2),"test failed");
        Assert.assertEquals("Philosophy & Psychology: 1257 Applied Science: 145 ",getCell(9,2),"test fail");

    }

    }
