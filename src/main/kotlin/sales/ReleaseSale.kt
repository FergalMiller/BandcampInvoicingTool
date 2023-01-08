package sales

import java.time.LocalDateTime

data class ReleaseSale(
    override val catNo: String,
    override val value: Int,
    override val dateTime: LocalDateTime
): SaleItem