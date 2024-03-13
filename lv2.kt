class MainMenu (val number: Int, val name: String) {
    fun display() { }
}

class ChocoIceCreamMenu (val number: Int, val name: String, val price: Int) {
    fun display() {
        println("아래에서 원하시는 아이스크림을 선택해주세요!")
        println("--------------------------------")
        println("1. 초코 익스트림                 |   1900")
        println("2. 초코 익스트림 - 마시멜로우 토핑   |   2000")
        println("3. 초코 헤이즐넛                 |   2000")
        println("4. 초코 헤이즐넛 - 아몬드 토핑      |   2100")
        println("5. 처음으로 이동")
        println("0. 종료")

        val subMenu1 = readLine()?.toIntOrNull() ?: 0

        if (subMenu1 == 0) {
            println("종료합니다.")
        }

        when (subMenu1) {
            1 -> println("초코 익스트림을 선택하셨습니다.")
            2 -> println("초코 익스트림 - 마시멜로우 토핑을 선택하셨습니다.")
            3 -> println("초코 헤이즐넛을 선택하셨습니다.")
            4 -> println("초코 헤이즐넛 - 아몬드 토핑을 선택하셨습니다.")
            5 -> println("메인 메뉴로 이동합니다.")
            else -> println("잘못 누르셨습니다.")
        }
    }
}

class VanillaIceCreamMenu (val number: Int, val name: String, val price: Int) {
    fun display() {
        println("아래에서 원하시는 아이스크림을 선택해주세요!")
        println("--------------------------------")
        println("1. 바닐라 익스트림                 |   1900")
        println("2. 바닐라 익스트림 - 벨기에 초코 토핑  |   2000")
        println("3. 바닐라 캐러멜                   |   2100")
        println("4. 바닐라 스트로베리                |   2100")
        println("5. 처음으로 이동")
        println("0. 종료")

        val subMenu2 = readLine()?.toIntOrNull() ?: 0

        if (subMenu2 == 0) {
            println("종료합니다.")
        }

        when (subMenu2) {
            1 -> println("바닐라 익스트림을 선택하셨습니다.")
            2 -> println("바닐라 익스트림 - 벨기에 초코 토핑을 선택하셨습니다.")
            3 -> println("바닐라 캐러멜을 선택하셨습니다.")
            4 -> println("바닐라 스트로베리를 선택하셨습니다.")
            5 -> println("메인 메뉴로 이동합니다.")
            else -> println("잘못 누르셨습니다.")
        }
    }
}

class AmericanoMenu (val number: Int, val name: String, val price: Int) {
    fun display() {
        println("아래에서 원하시는 커피를 선택해주세요!")
        println("----------------------------")
        println("1. 아메리카노I   |   2000")
        println("2. 아메리카노R   |   2500")
        println("3. 아메리카노L   |   3000")
        println("4. 처음으로 이동")
        println("0. 종료")

        val subMenu3 = readLine()?.toIntOrNull() ?: 0

        if (subMenu3 == 0) {
            println("종료합니다.")
        }

        when (subMenu3) {
            1 -> println("아메리카노I를 선택하셨습니다.")
            2 -> println("아메리카노R을 선택하셨습니다.")
            3 -> println("아메리카노L을 선택하셨습니다.")
            4 -> println("메인 메뉴로 이동합니다.")
            else -> println("잘못 누르셨습니다.")
        }
    }
}

class CaffeLatteMenu (val number: Int, val name: String, val price: Int) {
    fun display() {
        println("아래에서 원하시는 커피를 선택해주세요!")
        println("----------------------------")
        println("1. 카페라떼I   |   3000")
        println("2. 카페라떼R   |   3500")
        println("3. 카페라떼L   |   4000")
        println("4. 처음으로 이동")
        println("0. 종료")

        val subMenu4 = readLine()?.toIntOrNull() ?: 0

        if (subMenu4 == 0) {
            println("종료합니다.")
        }

        when (subMenu4) {
            1 -> println("카페라떼I를 선택하셨습니다.")
            2 -> println("카페라떼R을 선택하셨습니다.")
            3 -> println("카페라떼L을 선택하셨습니다.")
            4 -> println("메인 메뉴로 이동합니다.")
            else -> println("잘못 누르셨습니다.")
        }
    }
}

class CakeMenu (val number: Int, val name: String, val price: Int) {
    fun display() {
        println("아래에서 원하시는 케이크를 선택해주세요!")
        println("-----------------------------")
        println("1. 블랙베리   |   5000")
        println("2. 치즈      |   5000")
        println("3. 고구마     |   5500")
        println("4. 처음으로 이동")
        println("0. 종료")

        val subMenu5 = readLine()?.toIntOrNull() ?: 0

        if (subMenu5 == 0) {
            println("종료합니다.")
        }

        when (subMenu5) {
            1 -> println("블랙베리 케익을 선택하셨습니다.")
            2 -> println("치즈 케익을 선택하셨습니다.")
            3 -> println("고구마 케익을 선택하셨습니다.")
            4 -> println("메인 메뉴로 이동합니다.")
            else -> println("잘못 누르셨습니다.")
        }
    }
}

fun main() {

    while (true) {
        println("아래에서 원하시는 메뉴를 선택해주세요!")
        println("----------------------------")
        println("1. 초코 아이스크림")
        println("2. 바닐라 아이스크림")
        println("3. 아메리카노 커피")
        println("4. 카페라떼 커피")
        println("5. 케이크")
        println("0. 종료")

        val mainMenu = readLine()?.toIntOrNull() ?: 0

        if (mainMenu == 0) {
            println("종료합니다.")
            break
        }

        when (mainMenu) {

            1 -> {
                val chocoIceCreamMenu = ChocoIceCreamMenu(1, "초코 아이스크림 메뉴", 0)
                chocoIceCreamMenu.display()
            }

            2 -> {
                val vanillaIceCreamMenu = VanillaIceCreamMenu(2, "바닐라 아이스크림 메뉴", 0)
                vanillaIceCreamMenu.display()
            }

            3 -> {
                val americanoMenu = AmericanoMenu(3, "아메리카노 메뉴", 0)
                americanoMenu.display()
            }

            4 -> {
                val caffeLatteMenu = CaffeLatteMenu(4, "카페라떼 메뉴", 0)
                caffeLatteMenu.display()
            }

            5 -> {
                val cakeMenu = CakeMenu(5, "케이크 메뉴,", 0)
                cakeMenu.display()
            }

            else -> println("잘못 누르셨습니다.")
        }
    }
}
