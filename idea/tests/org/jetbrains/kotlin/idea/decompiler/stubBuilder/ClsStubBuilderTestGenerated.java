/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.decompiler.stubBuilder;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/decompiler/stubBuilder")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ClsStubBuilderTestGenerated extends AbstractClsStubBuilderTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInStubBuilder() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/decompiler/stubBuilder"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("AnnotatedFlexibleTypes")
    public void testAnnotatedFlexibleTypes() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/AnnotatedFlexibleTypes/");
    }

    @TestMetadata("AnnotatedParameterInEnumConstructor")
    public void testAnnotatedParameterInEnumConstructor() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/AnnotatedParameterInEnumConstructor/");
    }

    @TestMetadata("AnnotatedParameterInInnerClassConstructor")
    public void testAnnotatedParameterInInnerClassConstructor() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/AnnotatedParameterInInnerClassConstructor/");
    }

    @TestMetadata("AnnotationClass")
    public void testAnnotationClass() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/AnnotationClass/");
    }

    @TestMetadata("AnnotationValues")
    public void testAnnotationValues() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/AnnotationValues/");
    }

    @TestMetadata("Annotations")
    public void testAnnotations() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/Annotations/");
    }

    @TestMetadata("AnnotationsOnNullableTypes")
    public void testAnnotationsOnNullableTypes() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/AnnotationsOnNullableTypes/");
    }

    @TestMetadata("AnnotationsOnParenthesizedTypes")
    public void testAnnotationsOnParenthesizedTypes() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/AnnotationsOnParenthesizedTypes/");
    }

    @TestMetadata("AnonymousReturnWithGenericType")
    public void testAnonymousReturnWithGenericType() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/AnonymousReturnWithGenericType/");
    }

    @TestMetadata("ClassMembers")
    public void testClassMembers() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/ClassMembers/");
    }

    @TestMetadata("ClassObject")
    public void testClassObject() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/ClassObject/");
    }

    @TestMetadata("Const")
    public void testConst() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/Const/");
    }

    @TestMetadata("Contracts")
    public void testContracts() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/Contracts/");
    }

    @TestMetadata("DataClass")
    public void testDataClass() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/DataClass/");
    }

    @TestMetadata("Delegation")
    public void testDelegation() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/Delegation/");
    }

    @TestMetadata("DependencyOnNestedClasses")
    public void testDependencyOnNestedClasses() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/DependencyOnNestedClasses/");
    }

    @TestMetadata("Enum")
    public void testEnum() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/Enum/");
    }

    @TestMetadata("FlexibleTypes")
    public void testFlexibleTypes() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/FlexibleTypes/");
    }

    @TestMetadata("InheritingClasses")
    public void testInheritingClasses() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/InheritingClasses/");
    }

    @TestMetadata("InnerTypes")
    public void testInnerTypes() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/InnerTypes/");
    }

    @TestMetadata("LocalClass")
    public void testLocalClass() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/LocalClass/");
    }

    @TestMetadata("Modifiers")
    public void testModifiers() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/Modifiers/");
    }

    @TestMetadata("MultifileClass")
    public void testMultifileClass() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/MultifileClass/");
    }

    @TestMetadata("NamedCompanionObject")
    public void testNamedCompanionObject() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/NamedCompanionObject/");
    }

    @TestMetadata("NestedClasses")
    public void testNestedClasses() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/NestedClasses/");
    }

    @TestMetadata("Objects")
    public void testObjects() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/Objects/");
    }

    @TestMetadata("PrivateToThis")
    public void testPrivateToThis() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/PrivateToThis/");
    }

    @TestMetadata("Sealed")
    public void testSealed() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/Sealed/");
    }

    @TestMetadata("SecondaryConstructors")
    public void testSecondaryConstructors() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/SecondaryConstructors/");
    }

    @TestMetadata("SuspendLambda")
    public void testSuspendLambda() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/SuspendLambda/");
    }

    @TestMetadata("TopJvmPackageName")
    public void testTopJvmPackageName() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/TopJvmPackageName/");
    }

    @TestMetadata("TopLevelMembersAnnotatedKt")
    public void testTopLevelMembersAnnotatedKt() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/TopLevelMembersAnnotatedKt/");
    }

    @TestMetadata("TopLevelMembersKt")
    public void testTopLevelMembersKt() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/TopLevelMembersKt/");
    }

    @TestMetadata("TypeAliases")
    public void testTypeAliases() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/TypeAliases/");
    }

    @TestMetadata("TypeBoundsAndDelegationSpecifiers")
    public void testTypeBoundsAndDelegationSpecifiers() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/TypeBoundsAndDelegationSpecifiers/");
    }

    @TestMetadata("TypeModifiers")
    public void testTypeModifiers() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/TypeModifiers/");
    }

    @TestMetadata("TypeParams")
    public void testTypeParams() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/TypeParams/");
    }

    @TestMetadata("Types")
    public void testTypes() throws Exception {
        runTest("idea/testData/decompiler/stubBuilder/Types/");
    }
}
