package com.nttdata.page;

import org.openqa.selenium.By;

public class JuntozPage {
   public static By btnCuenta= By.xpath("//header/nav[@id='navbar']/div[1]/div[4]/div[2]/div[2]");
    public static By btnCancelarBanner = By.id("onesignal-slidedown-cancel-button");
    public static By btnRedirigirIniciarSesion= By.xpath("//a[contains(text(),'Iniciar sesión')]");
public static  By inputEmail= By.xpath("//input[@id='UserName']");
    public static  By inputPassword= By.xpath("//input[@id='Password']");
    public static By btnEnvioGratis= By.xpath("//body/section[@id='main-container']/div[@id='home']/div[1]/div[1]/div[3]");
    public static By btnIngresar= By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/input[1]");
    public static By btnAgregarCarrito= By.xpath("//body/section[@id='main-container']/div[@id='landing']/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[4]/div[1]/div[16]/div[3]/div[1]/button[1]");
    public static By btnVerificarCarrito= By.xpath("//header/nav[@id='navbar']/div[1]/div[4]/div[2]/div[1]/a[2]");




}
