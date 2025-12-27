import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Faculty fkn = new Faculty("Институт передовых биомедицинских исследований");

        Institute genomics = new Institute("Лаборатория геномики и эпигенетики", "GEN-101");
        Institute neuro = new Institute("Центр нейробиологии и когнитивных наук", "NEU-202");
        Institute biomaterials = new Institute("Лаборатория биоматериалов и тканевой инженерии", "BIO-303");
        Institute bioinfo = new Institute("Отдел биоинформатики и ИИ в медицине", "AI-404");
        Institute regen = new Institute("Центр регенеративной медицины", "REG-505");
        Institute immuno = new Institute("Лаборатория инфекционных заболеваний и иммунологии", "INF-606");

        fkn.setInstitutes(new Institute[]{genomics, neuro, biomaterials, bioinfo, regen, immuno});

        ResearchAssociate emp1 = new ResearchAssociate(1, "Др. Анна Соколова (Ведущий генетик)",
                "Картирование эпигенетических маркеров при раке");
        ResearchAssociate emp2 = new ResearchAssociate(2, "Др. Михаил Волков (Нейробиолог)",
                "Нейропластичность и механизмы обучения у взрослых");
        ResearchAssociate emp3 = new ResearchAssociate(3, "Инж. Екатерина Лебедева (Специалист по биоматериалам)",
                "3D-биопечать функциональных тканей сердца");
        ResearchAssociate emp4 = new ResearchAssociate(4, "Др. Алексей Морозов (Руководитель группы ИИ)",
                "Разработка ИИ для ранней диагностики болезни Альцгеймера");
        ResearchAssociate emp5 = new ResearchAssociate(5, "Др. Ольга Романова (Старший исследователь по стволовым клеткам)",
                "Дифференциация стволовых клеток в нейроны для терапии Паркинсона");
        ResearchAssociate emp6 = new ResearchAssociate(6, "Др. Иван Петров (Эпидемиолог)",
                "Моделирование распространения вирусов в урбанизированных зонах");
        ResearchAssociate emp7 = new ResearchAssociate(7, "Профессор Сергей Зайцев (Руководитель лаборатории иммунологии)",
                "Изучение аутоиммунных реакций при хронических инфекциях");

        genomics.setEmployees(new ResearchAssociate[]{emp1, emp7});
        neuro.setEmployees(new ResearchAssociate[]{emp2});
        biomaterials.setEmployees(new ResearchAssociate[]{emp3});
        bioinfo.setEmployees(new ResearchAssociate[]{emp4});
        regen.setEmployees(new ResearchAssociate[]{emp5});
        immuno.setEmployees(new ResearchAssociate[]{emp6});

        Institute[] fkn_institutes = fkn.getInstitutes();

        System.out.println("================================================================");
        System.out.println("Организация: " + fkn.getName());
        System.out.println("================================================================");
        System.out.println("Структура подразделений и ключевые исследователи:");

        for (Institute institute : fkn_institutes) {
            System.out.println("------------------------------------------------");
            System.out.println("Подразделение: " + institute.getName() + " (" + institute.getAddress() + ")");

            ResearchAssociate[] employees = institute.getEmployees();
            if (employees != null) {
                for (ResearchAssociate employee : employees) {
                    System.out.println("    - " + employee.getName() + " — " + employee.getFieldOfStudy());
                }
            } else {
                System.out.println("    (нет исследователей)");
            }
        }
        System.out.println("================================================================");
    }
}
