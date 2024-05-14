Feature: Prueba de regresión para validar la funcionalidad del Carrito de Compras en Juntoz

  @JuntozFuncionalidad
  Scenario: Iniciar sesión en Juntoz
    Given estoy en la página de Juntoz "https://juntoz.com/"
    When espera 30000
    Then click quitar banner y redirigir login
    And ingreso el email "jorgekik37@gmail.com"
    And ingreso la contraseña "mxmx2392"
    And en boton ingresar
    When espera 30000
    Then  click en envio gratis
    And agregar al carrito
    And verificar carrito

