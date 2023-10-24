package baseball.model

import baseball.BASEBALL_MAX_SIZE
import camp.nextstep.edu.missionutils.Randoms

class Computer {
    fun makeComputerList(): BaseBall {
        val computerList = mutableListOf<Int>()
        while (computerList.size < BASEBALL_MAX_SIZE) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (!computerList.contains(randomNumber)) {
                computerList.add(randomNumber)
            }
        }
        return BaseBall(computerList)
    }
}