import org.junit.jupiter.api.Test;

public class PersonalInformationTest extends BaseTest {

    @Test
    public void setName(){
       practicesFormPage.setName("Ayşegül");
    }
    @Test
    public void setLastName(){
        practicesFormPage.setLastSurName("selek");
    }
    @Test
    public void setEmail(){
        practicesFormPage.setEmail("aysegul.selek03@gmail.com");
    }
}
