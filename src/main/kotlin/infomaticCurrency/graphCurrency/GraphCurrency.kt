package infomaticCurrency.graphCurrency

import infomaticCurrency.InformaticCurrency

interface GraphCurrency: InformaticCurrency {
    override val setSingleInformaticCurrencyUnit: Set<SingleGraphCurrencyUnit>

}