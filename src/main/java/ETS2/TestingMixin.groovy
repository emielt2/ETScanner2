package ETS2

/**
 * Created by E on 09/01/2016.
 */
class TestingMixin {
    def script = new GroovyScriptEngine( '.' ).with {
        loadScriptByName( 'file1.groovy' )
    }

    void x(){
        def script = new GroovyScriptEngine( '.' ).with {
            loadScriptByName( 'file1.groovy' )
        }
        this.metaClass.mixin script

        method()
    }




}
