import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Faculty fkn = new Faculty("Факультет Космических Нанотехнологий");

        Institute astro = new Institute("Астрофизика", "AS101");
        Institute quantum = new Institute("Квантовая механика", "QM202");
        Institute nano = new Institute("Нанотехнологии", "NT303");
        Institute robo = new Institute("Робототехника", "RB404");
        Institute bio = new Institute("Биоинженерия", "BE505");
        Institute space = new Institute("Космические Исследования", "SI606");

        fkn.setInstitutes(new Institute[]{astro, quantum, nano, robo, bio, space});

        ResearchAssociate emp1 = new ResearchAssociate(1, "Звездный Артем Иванович",
                "Анализ галактических туманностей");
        ResearchAssociate emp2 = new ResearchAssociate(2, "Квантова Нина Петровна",
                "Теория струн и квантовые поля");
        ResearchAssociate emp3 = new ResearchAssociate(3, "Наносов Игорь Олегович",
                "Разработка наноматериалов для космических аппаратов");
        ResearchAssociate emp4 = new ResearchAssociate(4, "Роботов Василий Дмитриевич",
                "Создание автономных космических роботов");
        ResearchAssociate emp5 = new ResearchAssociate(5, "Бионова Елена Михайловна",
                "Космическая биомедицина и адаптация к невесомости");
        ResearchAssociate emp6 = new ResearchAssociate(6, "Спутников Максим Романович",
                "Мониторинг космического мусора");
        ResearchAssociate emp7 = new ResearchAssociate(7, "Гравитонов Дмитрий Андреевич",
                "Исследование гравитационных волн");

        astro.setEmployees(new ResearchAssociate[]{emp1, emp7});
        quantum.setEmployees(new ResearchAssociate[]{emp2});
        nano.setEmployees(new ResearchAssociate[]{emp3});
        robo.setEmployees(new ResearchAssociate[]{emp4});
        bio.setEmployees(new ResearchAssociate[]{emp5});
        space.setEmployees(new ResearchAssociate[]{emp6});

        Institute[] fkn_institutes = fkn.getInstitutes();

        System.out.println("================================================================");
        System.out.println("Факультет: " + fkn.getName());
        System.out.println("================================================================");
        System.out.println("Список кафедр и их сотрудники:");

        for (Institute institute : fkn_institutes) {
            System.out.println("------------------------------------------------");
            System.out.println("Кафедра: " + institute.getName() + " (" + institute.getAddress() + ")");

            ResearchAssociate[] employees = institute.getEmployees();
            if (employees != null) {
                for(ResearchAssociate employee : employees)
                {
                    System.out.println("    - " + employee.getName() + " (" + employee.getFieldOfStudy() + ")");

                }
            } else {
                System.out.println("   (нет сотрудников)");
            }

        }
        System.out.println("================================================================");
//        System.out.println("Массив институтов (для дебага): " + Arrays.toString(fkn.getInstitutes()));


    }
}