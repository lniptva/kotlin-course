// 1. Название мероприятия (неизменяемая публичная переменная известна на момент написания)
val name: String = "Hackathon Survival"

// 2. Дата проведения (публичная переменная известна, но может измениться из-за переноса)
var date: String = "09.09.2025"

// 3. Место проведения (публичная, может быть изменена)
var location: String = "Варшава"

// 4. Подробный бюджет мероприятия (приватная)
private var budgetDetails: String = "Подробный бюджет мероприятия"

// 5. Количество участников (публичная, меняется по мере регистрации)
var participantsCount: Int = 0

// 6. Длительность хакатона (публичная, фиксированная)
val durationdays: Int = 3

// 7. Контактная информация и условия соглашений с поставщиками (приватная)
private var suppliersContacts: String = "Контакты и условия соглашений"

// 8. Текущее состояние хакатона (публичная)
var status: String = "Подготовка"

// 9. Список спонсоров (публичная)
var sponsors: List<String> = listOf("Sponsor 1", "Sponsor 2", "Sponsor 3")

// 10. Бюджет мероприятия (публичная сумма)
var budget: Int = 100000

// 11. Текущий уровень доступа к интернету (публичная)
var internetAccess: String = "100 Mbps"

// 12. Информация о транспортировке оборудования и координации (приватная)
private var logistics: String = "Информация о транспортировке оборудования и координации"

// 13. Количество команд (публичная)
var teamsCount: Int = 5

// 14. Перечень задач (публичная)
var tasks: List<String> = emptyList()

// 15. План эвакуации (приватная)
private var evacuationPlan: String = "План эвакуации"

// 16. Список доступного оборудования (публичная)
var availableEquipment: List<String> = emptyList()

// 17. Список свободного оборудования (публичная)
var freeEquipment: List<String> = emptyList()

// 18. График питания участников (lateinit, известно позже)
lateinit var mealSchedule: String

// 19. План мероприятий на случай сбоев (приватная)
private var failoverPlan: String = "План на случай сбоев"

// 20. Список экспертов и жюри (публичная)
var jury: List<String> = emptyList()

// 21. Политика конфиденциальности (публичная)
val privacyPolicy: String = "Политика конфиденциальности"

// 22. Приватные отзывы участников и зрителей (приватная)
private var feedback: List<String> = emptyList()

// 23. Текущая температура в помещении (публичная)
var roomTemperature: Double = 22.0

// 24. Данные мониторинга сети (приватная)
private var networkMonitoring: String = "Данные мониторинга сети"

// 25. Регулятор скорости интернета (публичная)
var internetThrottle: Boolean = false

// 26. Уровень освещения (публичная)
var lightingLevel: Int = 80

// 27. Лог событий мероприятия (приватная)
private var eventLog: MutableList<String> = mutableListOf()

// 28. Возможность получения медицинской помощи (публичная)
var medicalAvailable: Boolean = true

// 29. Планы безопасности и ЧС (приватная)
private var safetyPlans: String = "Планы и протоколы безопасности"

// 30. Регистрационный номер мероприятия (публичная)
val registrationNumber: String = "HACK2025-001"

// 31. Максимально допустимый уровень шума (публичная)
val maxNoiseLevel: Int = 80

// 32. Индикатор превышения уровня шума (публичная)
var isNoiseExceeded: Boolean = false

// 33. План взаимодействия с прессой (приватная)
private var pressPlan: String = "План взаимодействия с прессой"

// 34. Публичная информация о проектах (публичная)
var publicProjectsInfo: String = "Информация о проектах команд"

// 35. Статус разрешений для проведения (публичная)
var permitsStatus: String = "Получено"

// 36. Индикатор доступности спец. оборудования (публичная)
var isSpecialEquipmentAvailable: Boolean = true

// 37. Список партнеров (публичная)
var partners: List<String> = listOf("Partner1", "Partner2")

// 38. Отчет после мероприятия (lateinit, генерируется позже)
lateinit var finalReport: String

// 39. Внутренние правила распределения призов (приватная)
private var prizeRules: String = "Внутренние правила распределения призов"

// 40. Список разыгрываемых призов (публичная)
var prizes: List<String> = listOf("Ноутбук", "Сертификат")

// 41. Контактная информация экстренных служб (приватная)
private var emergencyContacts: String = "Контакты экстренных служб"

// 42. Особые условия для участников с ограниченными возможностями (публичная)
var specialConditions: String = "Доступные условия"

// 43. Общее настроение участников (публичная)
var mood: String = "Позитивное"

// 44. Подробный план хакатона (lateinit, доступен перед стартом)
lateinit var hackathonPlan: String

// 45. Имя специального гостя (lateinit, объявляется позже)
lateinit var specialGuest: String

// 46. Максимальная вместимость места проведения (публичная)
val maxCapacity: Int = 50

// 47. Количество часов на проект (публичная)
val hoursPerTeam: Int = 48
