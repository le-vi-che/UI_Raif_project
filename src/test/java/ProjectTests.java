import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainRaifPage;
import pages.VacancyRaifPage;

import java.util.Arrays;
import java.util.List;

public class ProjectTests  extends TestBase{

    final List<String> list = Arrays.asList("Кредиты", "Ипотека","Карты", "Сбережения",
            "Инвестиции", "Страхование", "Переводы", "Сервисы", "Про Онлайн-банк", "Ещё...");

    MainRaifPage mainPage  = new MainRaifPage();
    VacancyRaifPage vacancyPage = new VacancyRaifPage();
    @Test
    @DisplayName("Проверка разделов в меню")
    void checkMenuContentTest(){
        mainPage.openPage()
                .checkMainChapters(list);

    }

@Test
@DisplayName("Проверка ссылок на app Store")
    void checkLinkToAppTest(){
    mainPage.openPage()
            .checkSocialsLinks();
    }


    @Test
    @DisplayName("Проверка открытия чата")

    void checkOpenChatTest(){
        mainPage.openPage()
                .openChat()
                .checkChat();
    }

    @Test
    @DisplayName("Проверка наличия кнопки Подать заявку в разделе Ипотека")

    void checkIpotekaButton(){
        mainPage.openPage()
                .openIpotekaChapter()
                .checkIpotekaButton();
    }

    @Test
    @DisplayName("Проверка наличия вакансий IT и DGTL")
    void checkCareerChapterTest(){
        mainPage.openPage()
                .goToVacancy();
        vacancyPage.openItVacancy()
                .checkItVacancy();
    }

    @Test
    @DisplayName("Поиск вакансии QA")
    void searchQaVacancyTest(){
        mainPage.openPage()
                .goToVacancy();
        vacancyPage.openVacancyPage()
                .inputQAtoFilter()
                .checkQaVacancy();
    }
}
