package com.danigelabert.cafeteriaapp

class DrinkProvider {
    companion object{
        val drinkList = listOf<Drink>(
            Drink("Coca Cola", "2,50€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/5b6931a9-76d3-4f32-a446-e8f26e8d3a69_producto-237.png?auto=compress,format"),
            Drink("Fanta Naranja", "2,50€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/724b16bf-0b82-4a01-b51d-b2ebeb2444ae_producto-245.png?auto=compress,format"),
            Drink("Cerveza Mahou", "3,50€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/075ec02b-1870-48af-a2fd-641ad8ac9e25_producto-79.png?auto=compress,format"),
            Drink("Agua", "1,20€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/52cb6a85-a601-4993-8711-de79538c9a0c_producto-78.png?auto=compress,format"),
            Drink("Sprite", "2,80€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/06d48bfb-1463-4aad-8fd8-e7ff0834fefe_1080x943_Sprite_Zero_Azucar.png?auto=compress,format"),
            Drink("Aquarius", "1,50€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/c0c60e00-522a-460e-93db-1c8dfc8740d2_1080x943_Aquarius_Zero_Azucar.png?auto=compress,format"),
            Drink("Café Expresso", "1,00€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/0c9d54b9-a031-402b-b411-2f09301ae034_producto-109.png?auto=compress,format"),
            Drink("Capuccino", "1,40€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/1d75f4e6-d896-4287-a0a5-88dca2b18885_producto-112.png?auto=compress,format"),
        )
    }
}