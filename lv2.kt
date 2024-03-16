class MainMenu (val number: Int, val name: String) {
    fun display() {
        println("아래에서 원하시는 메뉴를 선택해주세요!")
        println("----------------------------")
        println("1. 초코 아이스크림")
        println("2. 바닐라 아이스크림")
        println("3. 아메리카노 커피")
        println("4. 카페라떼 커피")
        println("5. 케이크")
        println("0. 종료")
    }
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
    }
}

fun main() {
    while (true) {
        val mainMenu = MainMenu(0, "메인 메뉴")
        mainMenu.display()

        val mainMenuInput = readLine()?.toIntOrNull()

        if (mainMenuInput == 0) {
            println("종료합니다.")
            break
        }

        when (mainMenuInput) {
            1 -> {
                val chocoIceCreamMenu = ChocoIceCreamMenu(1, "초코 아이스크림 메뉴", 0)
                chocoIceCreamMenu.display()

                val subMenu1Input = readLine()?.toIntOrNull() ?: 0

                if (subMenu1Input == 0) {
                    println("종료합니다.")
                }

                when (subMenu1Input) {
                    1 -> println("초코 익스트림을 선택하셨습니다.")
                    2 -> println("초코 익스트림 - 마시멜로우 토핑을 선택하셨습니다.")
                    3 -> println("초코 헤이즐넛을 선택하셨습니다.")
                    4 -> println("초코 헤이즐넛 - 아몬드 토핑을 선택하셨습니다.")
                    5 -> println("메인 메뉴로 이동합니다.")
                }
            }

            2 -> {
                val vanillaIceCreamMenu = VanillaIceCreamMenu(2, "바닐라 아이스크림 메뉴", 0)
                vanillaIceCreamMenu.display()

                val subMenu2Input = readLine()?.toIntOrNull() ?: 0

                if (subMenu2Input == 0) {
                    println("종료합니다.")
                }

                when (subMenu2Input) {
                    1 -> println("바닐라 익스트림을 선택하셨습니다.")
                    2 -> println("바닐라 익스트림 - 벨기에 초코 토핑을 선택하셨습니다.")
                    3 -> println("바닐라 캐러멜을 선택하셨습니다.")
                    4 -> println("바닐라 스트로베리를 선택하셨습니다.")
                    5 -> println("메인 메뉴로 이동합니다.")
                }
            }

            3 -> {
                val americanoMenu = AmericanoMenu(3, "아메리카노 메뉴", 0)
                americanoMenu.display()

                val subMenu3Input = readLine()?.toIntOrNull() ?: 0

                if (subMenu3Input == 0) {
                    println("종료합니다.")
                }

                when (subMenu3Input) {
                    1 -> println("아메리카노I를 선택하셨습니다.")
                    2 -> println("아메리카노R을 선택하셨습니다.")
                    3 -> println("아메리카노L을 선택하셨습니다.")
                    4 -> println("메인 메뉴로 이동합니다.")
                }
            }

            4 -> {
                val caffeLatteMenu = CaffeLatteMenu(4, "카페라떼 메뉴", 0)
                caffeLatteMenu.display()

                val subMenu4Input = readLine()?.toIntOrNull() ?: 0

                if (subMenu4Input == 0) {
                    println("종료합니다.")
                }

                when (subMenu4Input) {
                    1 -> println("카페라떼I를 선택하셨습니다.")
                    2 -> println("카페라떼R을 선택하셨습니다.")
                    3 -> println("카페라떼L을 선택하셨습니다.")
                    4 -> println("메인 메뉴로 이동합니다.")
                }
            }

            5 -> {
                val cakeMenu = CakeMenu(5, "케이크 메뉴,", 0)
                cakeMenu.display()

                val subMenu5Input = readLine()?.toIntOrNull() ?: 0

                if (subMenu5Input == 0) {
                    println("종료합니다.")
                }

                when (subMenu5Input) {
                    1 -> println("블랙베리 케이크를 선택하셨습니다.")
                    2 -> println("치즈 케이크를 선택하셨습니다.")
                    3 -> println("고구마 케이크를 선택하셨습니다.")
                    4 -> println("메인 메뉴로 이동합니다.")
                }
            }

            else -> println("잘못 누르셨습니다.")
        }
        continue
    }
}
