int lengthOfLastWord(char* s) {
    char *st=strtok(s," "),*word;
    while(st!=NULL){
        word= st;
        st=strtok(NULL," ");
    }
    return strlen(word);    
}