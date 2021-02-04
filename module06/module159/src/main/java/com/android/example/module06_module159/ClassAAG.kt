package com.android.example.module06_module159

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method1(
		param0: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		for (iAb in 0..1) {
			val local_var_3_0: com.android.example.module06_module281_module1.ClassAAG = com.android.example.module06_module281_module1.ClassAAG()
			local_var_3_0.method1(com.android.example.module06_module342_module3.ClassAAH(), com.android.example.module06_module342_module3.ClassAAG())

		}
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
	}

	fun method4(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module06_module342_module3.ClassAAB = com.android.example.module06_module342_module3.ClassAAB()
		local_var_2_4.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module06_module281_module1.ClassAAG = com.android.example.module06_module281_module1.ClassAAG()
		local_var_2_5.method0(com.android.example.module06_module342_module3.ClassAAE(), com.android.example.module06_module282_module1.ClassAAB(), com.android.example.module06_module282_module1.ClassAAF())

		param0.assertSubscribed()

		val local_var_2_6: com.android.example.module06_module342_module3.ClassAAA = com.android.example.module06_module342_module3.ClassAAA()
		local_var_2_6.method4("SomeString", "SomeString")

	}
}
