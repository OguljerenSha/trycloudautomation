package com.trycloud.tests;

import com.trycloud.Pages.FilesPagePOM;
import com.trycloud.tests.base.TestBase;
import org.testng.annotations.Test;

public class US003_TC008_1_karlygash extends TestBase {

    @Test(description = "Validation of deleting file by action icon")
    public void delete_file_test(){
        FilesPagePOM filesPagePOM = new FilesPagePOM();
        filesPagePOM.deleteFile();



    }
}
