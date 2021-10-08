package infomaticCurrency.graphCurrency

import infomaticCurrency.basic.InformaticCurrency

interface GraphCurrency: InformaticCurrency {
    override val setSingleInformaticCurrencyUnit: Set<SingleGraphCurrencyUnit>

}