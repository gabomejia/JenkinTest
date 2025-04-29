package steps;
 
import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
 
public class FreeRangeSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentospage = new PaginaFundamentosTesting();
 
    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }
 
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavegationBar(section);
    }

    @And("select Introducción al Testing")
    public void navigateToIntro(){
        cursosPage.clickFundamentosTestingLink();
        fundamentospage.clickFundamentosTestingLink();

    }
 
}