class FileWrite{

    static void main ( String[] args){

        new File('/Users/sxg115/groovy-scripts/sivag.txt').withWriter(){
            writer -> writer.writeLine 'Hello World'
        }

        File f = new File('/Users/sxg115/groovy-scripts/sivag.txt')
        println "The file size is ${f.length()} bytes"

    }

}
