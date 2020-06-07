package com.example.mary.data

object FakeData {

    val listEvent = listOf(
        EventModel("Название мероприятия 1", "1.12.2020"),
        EventModel("Название мероприятия 2", "2.12.2020"),
        EventModel("Название мероприятия 3", "3.12.2020"),
        EventModel("Название мероприятия 4", "4.12.2020"),
        EventModel("Название мероприятия 5", "5.12.2020"),
        EventModel("Название мероприятия 6", "6.12.2020"),
        EventModel("Название мероприятия 7", "7.12.2020")
    )

    val listAdaptation = listOf(
        AdaptationModel("Название действия адаптации 1", "1.12.2020", "пройдено 20%"),
        AdaptationModel("Название действия адаптации 2", "2.12.2020", "пройдено 20%"),
        AdaptationModel("Название действия адаптации 3", "3.12.2020", "пройдено 20%"),
        AdaptationModel("Название действия адаптации 4", "4.12.2020", "пройдено 20%"),
        AdaptationModel("Название действия адаптации 5", "5.12.2020", "пройдено 20%"),
        AdaptationModel("Название действия адаптации 6", "6.12.2020", "пройдено 20%"),
        AdaptationModel("Название действия адаптации 7", "7.12.2020", "пройдено 20%")
    )

    val listPeople = listOf(
        DialogModel(
            "https://feme.ua/wp-content/uploads/2020/04/scarlett-johansson.jpg",
            "Иванова Мария"
        ),
        DialogModel(
            "https://feme.ua/wp-content/uploads/2020/04/scarlett-johansson.jpg",
            "Иванова Мария"
        ),
        DialogModel(
            "https://feme.ua/wp-content/uploads/2020/04/scarlett-johansson.jpg",
            "Иванова Мария"
        ),
        DialogModel(
            "https://feme.ua/wp-content/uploads/2020/04/scarlett-johansson.jpg",
            "Иванова Мария"
        ),
        DialogModel(
            "https://feme.ua/wp-content/uploads/2020/04/scarlett-johansson.jpg",
            "Иванова Мария"
        ),
        DialogModel(
            "https://feme.ua/wp-content/uploads/2020/04/scarlett-johansson.jpg",
            "Иванова Мария"
        ),
        DialogModel(
            "https://feme.ua/wp-content/uploads/2020/04/scarlett-johansson.jpg",
            "Иванова Мария"
        ),
        DialogModel(
            "https://feme.ua/wp-content/uploads/2020/04/scarlett-johansson.jpg",
            "Иванова Мария"
        ),
        DialogModel(
            "https://feme.ua/wp-content/uploads/2020/04/scarlett-johansson.jpg",
            "Иванова Мария"
        )
    )

    val listDialog = listOf(
        DialogModel(
            "https://lh3.googleusercontent.com/6UgEjh8Xuts4nwdWzTnWH8QtLuHqRMUB7dp24JYVE2xcYzq4HA8hFfcAbU-R-PC_9uA1",
            "Google"
        ),
        DialogModel(
            "https://lh3.googleusercontent.com/6UgEjh8Xuts4nwdWzTnWH8QtLuHqRMUB7dp24JYVE2xcYzq4HA8hFfcAbU-R-PC_9uA1",
            "Google"
        ),
        DialogModel(
            "https://lh3.googleusercontent.com/6UgEjh8Xuts4nwdWzTnWH8QtLuHqRMUB7dp24JYVE2xcYzq4HA8hFfcAbU-R-PC_9uA1",
            "Google"
        ),
        DialogModel(
            "https://lh3.googleusercontent.com/6UgEjh8Xuts4nwdWzTnWH8QtLuHqRMUB7dp24JYVE2xcYzq4HA8hFfcAbU-R-PC_9uA1",
            "Google"
        ),
        DialogModel(
            "https://lh3.googleusercontent.com/6UgEjh8Xuts4nwdWzTnWH8QtLuHqRMUB7dp24JYVE2xcYzq4HA8hFfcAbU-R-PC_9uA1",
            "Google"
        ),
        DialogModel(
            "https://lh3.googleusercontent.com/6UgEjh8Xuts4nwdWzTnWH8QtLuHqRMUB7dp24JYVE2xcYzq4HA8hFfcAbU-R-PC_9uA1",
            "Google"
        ),
        DialogModel(
            "https://lh3.googleusercontent.com/6UgEjh8Xuts4nwdWzTnWH8QtLuHqRMUB7dp24JYVE2xcYzq4HA8hFfcAbU-R-PC_9uA1",
            "Google"
        ),
        DialogModel(
            "https://lh3.googleusercontent.com/6UgEjh8Xuts4nwdWzTnWH8QtLuHqRMUB7dp24JYVE2xcYzq4HA8hFfcAbU-R-PC_9uA1",
            "Google"
        ),
        DialogModel(
            "https://lh3.googleusercontent.com/6UgEjh8Xuts4nwdWzTnWH8QtLuHqRMUB7dp24JYVE2xcYzq4HA8hFfcAbU-R-PC_9uA1",
            "Google"
        )
    )

    val hr = InfoMenModel(
        "Контактные данные HR-менеджера",
        "Петров Петр Петрович",
        "+79181111111",
        "+79182222222",
        "Специалист по персоналу",
        "Отдел кадров"
    )

    val teacher = InfoMenModel(
        "Контактные данные наставника",
        "Иванов Иван Иванович",
        "+79181111111",
        "+79182222222",
        "Ведущий системный аналитик",
        "ОРИСП"
    )

    val director = InfoMenModel(
        "Контактные данные руководителя",
        "Данилин Данил Данилович",
        "+79181111111",
        "+79182222222",
        "Руководитель отдела",
        "ОРИСП"
    )

    val listTeachers = mutableListOf(
        InfoMenModel(
            "Контактные данные",
            "Семенов Семен Семеныч",
            "+79181111111",
            "+79182222222",
            "Специалист по персоналу",
            "Отдел кадров"
        ), InfoMenModel(
            "Контактные данные",
            "Магомкдов Магамед Магамедович",
            "+79181111111",
            "+79182222222",
            "Специалист по персоналу",
            "Отдел кадров"
        ), InfoMenModel(
            "Контактные данные",
            "Филипов Филип Филипович",
            "+79181111111",
            "+79182222222",
            "Специалист по персоналу",
            "Отдел кадров"
        ), InfoMenModel(
            "Контактные данные",
            "Тимохин Тимофей Тимофеевич",
            "+79181111111",
            "+79182222222",
            "Специалист по персоналу",
            "Отдел кадров"
        )
    )

    val listStudents = mutableListOf(
        InfoMenModel(
            "Контактные данные",
            "Григорьев Григорий Григорьевич",
            "+79181111111",
            "+79182222222",
            "Ведущий системный аналитик",
            "ОРИСП"
        ),
        InfoMenModel(
            "Контактные данные",
            "Евгенин Евгений Евгеньефич",
            "+79181111111",
            "+79182222222",
            "Ведущий системный аналитик",
            "ОРИСП"
        ),
        InfoMenModel(
            "Контактные данные",
            "Александров Александр Александрович",
            "+79181111111",
            "+79182222222",
            "Ведущий системный аналитик",
            "ОРИСП"
        ),
        InfoMenModel(
            "Контактные данные",
            "Антонов Антон Антонович",
            "+79181111111",
            "+79182222222",
            "Ведущий системный аналитик",
            "ОРИСП"
        )
    )
}