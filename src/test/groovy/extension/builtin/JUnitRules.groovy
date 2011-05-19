package extension.builtin

import spock.lang.Specification
import org.junit.rules.TestName
import org.junit.Rule

class JUnitRules extends Specification {
    @Rule name = new TestName()

    def "retrieve test name at runtime"() {
        println "running '$name.methodName'"
        expect: 1 + 1 == 2
    }
}
