class CopyFiles {
    static void main (String[] args){
        def rootFiles = new File('/Users/sxg115/groovy-scripts').eachFile(){
            file -> println "${file.getAbsolutePath()}"
        }

        def recurse = new File('/Users/sxg115/groovy-scripts').eachFileRecurse(){
            file -> println "${file.getAbsolutePath()}"
        }
    }
}