package com.android.example.module06_module159

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method1(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		param0.get()

		val local_var_2_2: com.android.example.module06_module342_module3.ClassAAB = com.android.example.module06_module342_module3.ClassAAB()
		local_var_2_2.method2("SomeString", "SomeString")

		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module342_module3.ClassAAE = com.android.example.module06_module342_module3.ClassAAE()
			local_var_3_0.method0("SomeString", "SomeString")

		}
		val local_var_2_3: com.android.example.module06_module281_module1.ClassAAF = com.android.example.module06_module281_module1.ClassAAF()
		local_var_2_3.method3(com.android.example.module06_module342_module3.ClassAAA())

	}

	fun method2(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module06_module281_module1.ClassAAA = com.android.example.module06_module281_module1.ClassAAA()
		local_var_2_2.method0(com.android.example.module06_module282_module1.ClassAAD(), com.android.example.module06_module282_module1.ClassAAA(), com.android.example.module06_module342_module3.ClassAAF())

		val local_var_2_3: com.android.example.module06_module342_module3.ClassAAE = com.android.example.module06_module342_module3.ClassAAE()
		local_var_2_3.method1("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module06_module282_module1.ClassAAA = com.android.example.module06_module282_module1.ClassAAA()
		local_var_2_4.method3(io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		param0.assertSubscribed()

		param0.dispose()

	}

	fun method4(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module06_module282_module1.ClassAAF = com.android.example.module06_module282_module1.ClassAAF()
		local_var_2_2.method2(com.android.example.module06_module342_module3.ClassAAE(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: com.android.example.module06_module342_module3.ClassAAH = com.android.example.module06_module342_module3.ClassAAH()
		local_var_2_3.method1("SomeString")

	}
}
