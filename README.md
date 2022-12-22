## JoshueMunoz_TACOS

TACOS stands for Test Automation Challenge Official System

## Executing tests
Tests for **Feature1** are in the `FeatureOneTests` class. To execute a test simply go to this class and press the Play button on the side. ![Test execution example](https://drive.google.com/file/d/1gCI4YhkRtOnr64z7xYMZkbtTZ87kENBY/view?usp=share_link)

There's an issue with the execution through testng which I was not able to fix in time. I'll take a look. Any help will be appreciated and hopefully this is the only issue. :)

## Chromedriver
The driver is contained on the **chromedriver** folder of the project. The BeforeTest uses the driver for Chrome version 108. Additional files for versions 107 and 109 are also on the project, and this change can be done on **line 26 of the BaseTest class**. 
