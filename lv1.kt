
fun main() {

    while (true) {
        println("아래에서 원하시는 메뉴를 선택해주세요!")
        println("----------------------------")
        println("[ 아이스크림 ]")
        println("1. 초코")
        println("2. 바닐라")
        println("[ 커피 ]")
        println("3. 아메리카노")
        println("4. 카페라떼")
        println("[ 케익 ]")
        println("5. 케익")
        println("----------------------------")
        println("0. 종료")

        val mainMenu = readLine()?.toInt()

        if (mainMenu == 0) {
            println("종료합니다.")
            break
        }

        when (mainMenu) {
            1 -> println("아래에서 원하시는 아이스크림을 선택해주세요!")
                 println("----------------------------")
                 println("1. 초코 익스트림                 |   1900")
                 println("2. 초코 익스트림 - 마시멜로우 토핑   |   2000")
                 println("3. 초코 헤이즐넛                 |   2000")
                 println("4. 초코 헤이즐넛 - 아몬드 토핑      |   2100")
                 println("5. 처음으로 이동")
                 println("0. 종료")

                 val subMenu1 = readLine()?.toInt()

                 if (subMenu1 == 0) {
                     println("종료합니다.")
                     break
                 }

                 when (subMenu1) {
	             1 -> println("초코 익스트림을 선택하셨습니다.")
	             2 -> println("초코 익스트림 - 마시멜로우 토핑을 선택하셨습니다.")
 	 	     3 -> println("초코 헤이즐넛을 선택하셨습니다.")
        	     4 -> println("초코 헤이즐넛 - 아몬드 토핑을 선택하셨습니다.")
                     5 -> println("메인 메뉴로 이동합니다.")
                 }
 
            2 -> println("아래에서 원하시는 아이스크림을 선택해주세요!")
                 println("----------------------------")
                 println("1. 바닐라 익스트림                 |   1900")
                 println("2. 바닐라 익스트림 - 벨기에 초코 토핑  |   2000")
                 println("3. 바닐라 캐러멜                   |   2100")
                 println("4. 바닐라 스트로베리                |   2100")
                 println("5. 처음으로 이동")
                 println("0. 종료")

                 val subMenu2 = readLine()?.toInt()

                 if (subMenu2 == 0) {
                     println("종료합니다.")
                     break
                 }

                 when (subMenu2) {
                     1 -> println("바닐라 익스트림을 선택하셨습니다.")
                     2 -> println("바닐라 익스트림 - 벨기에 초코 토핑을 선택하셨습니다.")
                     3 -> println("바닐라 캐러멜을 선택하셨습니다.")
                     4 -> println("바닐라 스트로베리를 선택하셨습니다.")
                     5 -> println("메인 메뉴로 이동합니다.")
                 }

            3 -> println("아래에서 원하시는 커피를 선택해주세요!")
                 println("----------------------------")
                 println("1. 아메리카노I   |   2000")
                 println("2. 아메리카노R   |   2500")
                 println("3. 아메리카노L   |   3000")
                 println("4. 처음으로 이동")
                 println("0. 종료")

                 val subMenu3 = readLine()?.toInt()

                 if (subMenu3 == 0) {
                     println("종료합니다.")
                     break
                 }

                 when (subMenu3) {
                     1 -> println("아메리카노I를 선택하셨습니다.")
                     2 -> println("아메리카노R을 선택하셨습니다.")
                     3 -> println("아메리카노L을 선택하셨습니다.")
                     4 -> println("메인 메뉴로 이동합니다.")
                 }

            4 -> println("아래에서 원하시는 커피를 선택해주세요!")
                 println("----------------------------")
                 println("1. 카페라떼I   |   3000")
                 println("2. 카페라떼R   |   3500"))
                 println("3. 카페라떼L   |   4000")
                 println("4. 처음으로 이동")
                 println("0. 종료")

                 val subMenu4 = readLine()?.toInt()

                 if (subMenu4 == 0) {
                     println("종료합니다.")
                     break
                 }

                 when (subMenu4) {
                     1 -> println("카페라떼I를 선택하셨습니다.")
                     2 -> println("카페라떼R을 선택하셨습니다.")
                     3 -> println("카페라떼L을 선택하셨습니다.")
                     4 -> println("메인 메뉴로 이동합니다.")
                 }

            5 -> println("아래에서 원하시는 케익을 선택해주세요!")
                 println("----------------------------")
                 println("1. 블랙베리   |   4000")
                 println("2. 치즈      |   4000")
                 println("3. 고구마     |   4500")
                 println("4. 처음으로 이동")
                 println("0. 종료")

                 val subMenu5 = readLine()?.toInt()

                 if (subMenu5 == 0) {
                     println("종료합니다.")
                     break
                 }

                 when (subMenu5) {
                     1 -> println("블랙베리 케익을 선택하셨습니다.")
                     2 -> println("치즈 케익을 선택하셨습니다.")
                     3 -> println("고구마 케익을 선택하셨습니다.")
                     4 -> println("메인 메뉴로 이동합니다.")
                 }
        }

        else {
            println("잘못 누르셨습니다.")
            continue
        }

    }
}

