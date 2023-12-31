# SP-SimbirSoft
ЛП 2к - Летняя Практика в SimbirSoft (2023) 

Выполнил: Бирюков Александр Дмитриевич (КФУ/ИТИС/11-111) 

Tg: https://t.me/SanyaLn 

HH.ru: https://nn.hh.ru/resume/c458e78eff0c0dd3760039ed1f7047504d6247

Android приложение, представляющее из себя ежедневник, Список дел с календарем

## Feature:
 * Экран на котором присутствует возможность выбрать один день, после выбора дня в конце экрана обновится список с делами
 * Экран создания дела, на котором присутствует возможность указать название, выбрать дату и время, краткоеописание дела текстом
 * При первом запуске приложение появляетс вфбрать JSON файл со списком уже существующик дел


| После import-а задач из JSON                  | Добавление Задачи                             | Результат                                     |
|-----------------------------------------------|-----------------------------------------------|-----------------------------------------------| 
| ![alt text](imageForPreview/Screenshot_1.jpg) | ![alt text](imageForPreview/Screenshot_3.jpg) | ![alt text](imageForPreview/Screenshot_2.jpg) | 

## По критериям:

1й уровень:
- Структурированный чистый код [+]
- Использование сервисного слоя для подготовки данных [+]
- Адаптивная верстка с использованием Constraint Layout или
сопутствующих технологий в xml разметках [+]
- Использование архитектурных паттернов [+]
- Поддержка версий - Android 8+ [+]
- Ориентация - портретная [+]
- Код на GitHub [+]
  
2й уровень:
- Добавить экран создания дела, на котором присутствует
возможность указать название, выбрать дату и время, краткое
описание дела текстом [+]
- Создание компонентов экрана кодом с помощью кастомных вью на
Kotlin или верстка с помощью Jetpack Compose [-]
- Для локального хранения используем Room [+]
- Покрытие Unit-тестами: 1-2 тест [-]

## Example JSON:

[
{
    "id": 1,
    "date_start": "1688990866634",
    "date_finish": "1688994466635",
    "name": "My task",
    "description": "Описание моего дела"
},
{
    "id": 2,
    "date_start": "1688990866634",
    "date_finish": "1688994466635",
    "name": "My task",
    "description": "Описание моего дела"
}
]
