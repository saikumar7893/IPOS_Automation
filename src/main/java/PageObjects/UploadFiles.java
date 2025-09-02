package PageObjects;

import BaseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFiles extends BaseClass {

    @FindBy(xpath = "//*[@id=\"nikKtpPhoto_web\"]")
    WebElement UploadID;

    @FindBy(xpath = "//*[@id=\"selfiePhoto_web\"]")
    WebElement UploadPhoto;

    @FindBy(xpath = "//*[@id=\"upload_doc\"]")
    WebElement UploadFABDoc;



    public UploadFiles(){
        PageFactory.initElements(driver,this);
    }

    public void uploadIDProof(String fileName){
        String filePath = System.getProperty("user.dir")
                + "/src/main/resources/TestData/" + fileName;
        UploadID.sendKeys(filePath);
    }

    public void uploadSelfie(String fileName2){
        String filePath = System.getProperty("user.dir")
                + "/src/main/resources/TestData/" + fileName2;
        UploadPhoto.sendKeys(filePath);
    }

    public void uploadFABDocument(String fileName3){
        String filePath = System.getProperty("user.dir")
                + "/src/main/resources/TestData/" + fileName3;
        UploadFABDoc.sendKeys(filePath);
    }

}
