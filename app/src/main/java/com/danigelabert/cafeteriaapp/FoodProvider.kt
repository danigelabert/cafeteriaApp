package com.danigelabert.cafeteriaapp

class FoodProvider {
    companion object{
        val foodList = listOf<Food>(
            Food("Big Mac", "5,50€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/0f1e7c1e-bf9c-4d71-add8-341f32323981_1080x943_Best-Burger-clasicas-bm.png?auto=compress,format"),
            Food("CBO", "6,50€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/db5e39f4-5b8a-4e5f-965a-5c98d54ffcb6_1080x943_CBO-Cheddar.png?auto=compress,format"),
            Food("McPollo", "6,00€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/c62990cc-7e57-4403-96f1-f0e50565af48_1080x943_McPollo.png?auto=compress,format"),
            Food("Cheeseburger", "8,50€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/d641f37a-a15f-441c-b93b-781d31f82293_1080x943_Best-Burger-clasicas-Cheeseburger-Single.png?auto=compress,format"),
            Food("McFish", "4,20€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/c9e409b5-5173-4d72-8a3b-9a9557920304_producto-131.png?auto=compress,format"),
            Food("Chicken Mayo", "4,80€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/962f4381-ab64-4312-a5b8-6f03e5968963_1080x943_Menu%CC%814You_Mc+Pollo+Single.png?auto=compress,format"),
            Food("McExtreme", "7,50€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/95d545a0-dae1-434e-8148-8f51e40be611_550x440_McExtreme_Bacon.png?auto=compress,format"),
            Food("McRoyal", "8,00€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/c4f57e37-8dbe-4f2b-9dd8-abf8ea1c5fb6_1080x943_Best-Burger-clasicas-McRoyal.png?auto=compress,format"),
            Food("McCrispy", "6,40€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/82e5f02e-b20c-4d1f-b69a-38d5060f5fc7_1080x943_McCrispy_Original.png?auto=compress,format"),
            Food("Patatas Deluxe", "2,30€", "https://mcdonalds.es/api/cms/images/mcdonalds-es/0efb07d6-59f1-46b3-84f1-c67f6259a041_1080x943_Patatas_Fritas_peque%C3%B1as_Deluxe.png?auto=compress,format"),
        )
    }
}