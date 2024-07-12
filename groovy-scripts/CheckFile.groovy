class CheckFile{
    static void main (String[] args){
        File f = new File('aws-cli2.sh')
        println "file: ${f.isFile()}"
        println "Directory: ${f.isDirectory()}"
        println "file size is ${f.length()}"

        File newDir = new File('test')
        newDir.mkdir()

        File cf = new File('test/test-file').withWriter('UTF-8'){
            writer -> writer.writeLine "test write"
        }
    }
}