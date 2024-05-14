package com.nttdata.stepsdefinitions;

import com.nttdata.steps.JuntozLoginSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JuntozStepDefs {

    private WebDriver driver;
    private Scenario scenario;
    private JuntozLoginSteps juntozLoginSteps;

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
//driver.quit();
    }


    @Given("estoy en la página de Juntoz {string}")
    public void estoyEnLaPáginaDeJuntoz(String url) {
        driver.get(url);
        juntozLoginSteps= new JuntozLoginSteps(driver);

    }




    @And("ingreso el email {string}")
    public void ingresoElEmail(String email) {
        juntozLoginSteps.ingresarEmail(email);
    }

    @And("ingreso la contraseña {string}")
    public void ingresoLaContraseña(String password) {
        juntozLoginSteps.ingresarPassword(password);

    }

    @And("en boton ingresar")
    public void enBotonIngresar() {
        juntozLoginSteps.ingresar();
    }

    @Given("que he iniciado sesión en Juntoz")
    public void queHeIniciadoSesiónEnJuntoz() {
    }

    @When("espera {int}")
    public void espera(int arg0)  {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("click quitar banner y redirigir login")
    public void clickQuitarBanner() {
        juntozLoginSteps.clickQuitarBanner();

    }

    @Then("click en envio gratis")
    public void clickEnEnvioGratis() {
       juntozLoginSteps.clickEnvioGratis();
    }

    @And("agregar al carrito")
    public void agregarAlCarrito() {
        juntozLoginSteps.agregarCarrito();
    }

    @And("verificar carrito")
    public void verificarCarrito() {
        juntozLoginSteps.verificarCarrito();
    }
}
