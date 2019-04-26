$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/TaskIt.feature");
formatter.feature({
  "name": "Automatizar o site do Julio de Lima, TaskIt",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "Estar na plataforma",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acessei a plataforma \"http://www.juliodelima.com.br/taskit/\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "TaskItSteps.que_acessei_a_plataforma(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adicionar um contato na plataforma TaskIt",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ID3"
    },
    {
      "name": "@AdicionarContato"
    }
  ]
});
formatter.step({
  "name": "que estou logado na plataforma com as seguintes credenciais",
  "rows": [
    {
      "cells": [
        "Login",
        "Senha"
      ]
    },
    {
      "cells": [
        "Jenkins",
        "Jenkins"
      ]
    }
  ],
  "keyword": "Dado "
});
formatter.match({
  "location": "TaskItSteps.que_estou_logado_na_plataforma_com_as_seguintes_credenciais(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "na aba de ADD MORE DATA",
  "rows": [
    {
      "cells": [
        "Type",
        "Contact"
      ]
    },
    {
      "cells": [
        "E-mail",
        "Jenkins@Jenkins.com.br"
      ]
    }
  ],
  "keyword": "E "
});
formatter.match({
  "location": "TaskItSteps.na_aba_de_ADD_MORE_DATA()"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.framework.steps.TaksItSteps.TaskItSteps.na_aba_de_ADD_MORE_DATA() in file:/home/erich/dev/FrameworkJenkins/target/test-classes/\u0027 with pattern [^na aba de ADD MORE DATA$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Table:[[Type, Contact], [E-mail, Jenkins@Jenkins.com.br]]]. \nStep text: na aba de ADD MORE DATA\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:111)\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:66)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\n\tat cucumber.api.TestStep.run(TestStep.java:83)\n\tat cucumber.api.TestCase.run(TestCase.java:58)\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});