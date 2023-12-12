package step4.View

import step4.Model.Race

class ResultView(val race: Race) {
    fun printResult() {
        println("실행 결과")
        for (i in 1..race.attempt) {
            println("${i}번째 시도")
            printResultPerAttempt(i)
            println()
        }
        println()
        printWinner()
    }

    private fun printResultPerAttempt(i: Int) {
        for (j in race.participant.indices) {
            print("${race.participant[j].name} : ")
            printRacingSkidMark(race.participant[j].position[i])
            println()
        }
    }

    private fun printRacingSkidMark(number: Int) {
        repeat(number) {
            print("-")
        }
    }
    private fun printWinner() {
        val orderedList = race.participant.sortedByDescending { it.position.last() }
        val winners = orderedList.filter { it.position.last() == orderedList.first().position.last() }
        println("${winners.joinToString { it.name }}가 최종 우승했습니다.")
    }
}