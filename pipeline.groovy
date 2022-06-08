pipeline
{
    agent any
    stages
    { 
        stage ('scm checkout')
      {
          steps {sh 'echo code is getting downloaded'}
          }
       stage ('build stage')
       {
           steps {sh 'echo code is getting build'}
           }
       stage ('post build step')
       {
           steps {sh 'echo post build step'}
       }

       stage ('approval stage')
       {
           steps {input 'please privde the approval'}
       }
         stage ('deploy to qa')
       {
           steps {sh 'echo deplpy to qa'}
       }
         stage ('deploy to the prod')
       {
           steps {sh 'echo depoy to prod'}
       }

       
    }
}
