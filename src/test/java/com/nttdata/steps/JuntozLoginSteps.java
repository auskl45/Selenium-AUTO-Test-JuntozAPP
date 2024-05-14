package com.nttdata.steps;

import com.nttdata.page.JuntozPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JuntozLoginSteps {
    private WebDriver webDriver;

    public JuntozLoginSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
 public void esperarElemento(By elemento){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
     wait.until(ExpectedConditions.elementToBeClickable(elemento));


 }

    public void clickQuitarBanner() {
       esperarElemento(JuntozPage.btnCancelarBanner);
        WebElement btnCancelarBanner= webDriver.findElement(JuntozPage.btnCancelarBanner);
        WebElement btnCuenta= webDriver.findElement(JuntozPage.btnCuenta);
        WebElement btnRedirigirIniciarSesion= webDriver.findElement(JuntozPage.btnRedirigirIniciarSesion);
        if(btnCancelarBanner.isDisplayed() || btnCancelarBanner.isEnabled()){
            btnCancelarBanner.click();
            btnCuenta.click();
            btnRedirigirIniciarSesion.click();
        }else{
            btnCuenta.click();
            btnRedirigirIniciarSesion.click();
        }

    }

    public void ingresarEmail(String email) {
        esperarElemento(JuntozPage.inputEmail);
        WebElement txtEmail= webDriver.findElement(JuntozPage.inputEmail);
        txtEmail.sendKeys(email);
    }

    public void ingresarPassword(String password) {
        esperarElemento(JuntozPage.inputPassword);
        WebElement txtPassword= webDriver.findElement(JuntozPage.inputPassword);
        txtPassword.sendKeys(password);
    }


    public void clickEnvioGratis() {
        esperarElemento(JuntozPage.btnEnvioGratis);
        WebElement btnEnvioGratis= webDriver.findElement(JuntozPage.btnEnvioGratis);
        btnEnvioGratis.click();
    }

    public void ingresar() {
        esperarElemento(JuntozPage.btnIngresar);
        WebElement btnIngresar= webDriver.findElement(JuntozPage.btnIngresar);
        btnIngresar.click();
    }

    public void agregarCarrito() {
        esperarElemento(JuntozPage.btnAgregarCarrito);
        WebElement btnAgregarCarrito= webDriver.findElement(JuntozPage.btnAgregarCarrito);
        btnAgregarCarrito.click();
    }

    public void verificarCarrito() {
        esperarElemento(JuntozPage.btnVerificarCarrito);
        WebElement btnVerificarCarrito= webDriver.findElement(JuntozPage.btnVerificarCarrito);
        btnVerificarCarrito.click();
    }
}
