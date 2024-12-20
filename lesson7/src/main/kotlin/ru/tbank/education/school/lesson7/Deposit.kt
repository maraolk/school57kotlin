package ru.tbank.education.school.lesson7

import java.time.LocalDate

/**
 * Модель данных вклада. У одного пользователя может быть много вкладов.
 * Доступны только рублевые вклады.
 */
data class Deposit(
    /**
     * Уникальный идентификатор вклада. Указан в договоре, поэтому не может изменяться.
     */
    val id: Long,
    /**
     * Начальный депозит в рублях. Последующее пополнение или частичное изъятие невозможно.
     */
    val initialDeposit: Int,
    /**
     * Дата открытия вклада.
     */
    val createAt: LocalDate,
    /**
     * Длительность вклада в месяцах.
     */
    val durationMonths: Int,
    /**
     * Ставка сложного процента. Капитализация происходит каждый день.
     * Ставка в процентах, дроби процентов не допускаются.
     */
    val compoundInterestRate: Double,
    /**
     * Признак премиального клиента. Для таких клиентов на вклад начисляется дополнительное вознаграждение.
     */
    val isVip: Boolean
)
