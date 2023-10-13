package testClass;

import org.openqa.selenium.WebDriver;
import page.Cargainformacion;
import page.Login;

import java.text.ParseException;

public class Logeo {
    private Login login;
    private Cargainformacion cargaInformacion;WebDriver webDriver;
    public Logeo(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void CasoLogin1(String usuario, String clave) throws ParseException {
        login = new Login(webDriver);
        cargaInformacion = new Cargainformacion(webDriver);
        login.ingresarUsuario(usuario,clave);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
    }
}
