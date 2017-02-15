package lab07

class PropertySlurper {

    def props = new Properties()

    def Object parse(InputStream io) {
        props.load(io)
    }

    def propertyMissing(String name) {
        props."$name"
    }
}
