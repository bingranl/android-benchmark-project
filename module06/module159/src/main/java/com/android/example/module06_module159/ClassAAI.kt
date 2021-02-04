package com.android.example.module06_module159

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module06_module342_module3.ClassAAH = com.android.example.module06_module342_module3.ClassAAH()
		local_var_2_3.method4("SomeString", "SomeString", "SomeString")

		param0.get()

		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module342_module3.ClassAAH = com.android.example.module06_module342_module3.ClassAAH()
			local_var_3_0.method1("SomeString")

		}
	}

	fun method1(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		param0.get()

		val local_var_2_4: com.android.example.module06_module281_module1.ClassAAH = com.android.example.module06_module281_module1.ClassAAH()
		local_var_2_4.method2(com.android.example.module06_module282_module1.ClassAAJ(), com.android.example.module06_module282_module1.ClassAAC(), com.android.example.module06_module342_module3.ClassAAJ(), com.android.example.module06_module282_module1.ClassAAA())

	}

	fun method2(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: io.reactivex.internal.util.LinkedArrayList,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module06_module281_module1.ClassAAI = com.android.example.module06_module281_module1.ClassAAI()
		local_var_2_3.method1(com.android.example.module06_module282_module1.ClassAAF(), com.android.example.module06_module282_module1.ClassAAC(), com.android.example.module06_module282_module1.ClassAAJ(), com.android.example.module06_module342_module3.ClassAAC())

		param0.get()

		val local_var_2_4: com.android.example.module06_module282_module1.ClassAAB = com.android.example.module06_module282_module1.ClassAAB()
		local_var_2_4.method1(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: com.android.example.module06_module282_module1.ClassAAA = com.android.example.module06_module282_module1.ClassAAA()
		local_var_2_5.method1(io.reactivex.subscribers.TestSubscriber())

	}
}
