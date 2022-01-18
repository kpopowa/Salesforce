package tests;

import modals.Account;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountModalPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest{

    @Test

    public void accountShouldBeCreated(){

        //логин
        loginPage
                .open()
                .login("popowa.kri2021-9mhf@force.com", "misha.11");


        //открыть страницу аккаунтов
        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();
        assertTrue(isAccountModalOpen,"Попап не открылся");

        Account account = new Account("TestAccountName", "www.onliner.by ", "Investor")

        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                        .isPageOpen();

        assertTrue(isDetailsPageOpen,"Страница Details не открылась");
        System.out.println("!");

        assertEquals(accountDetailsPage.getFieldValueByName("Account Name"),account.getAccountName());
        assertEquals(accountDetailsPage.getFieldValueByName("Website"),account.getWebSite());
        assertEquals(accountDetailsPage.getFieldValueByName("Type"),account.getType());

        accountDetailsPage.validateAccount(account);

        //кликнуть new кнопку
        //заполнить все поля
        //нажать на save
        //проверить создание
    }


    }
}
