package com.android.example.module06_module002_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		param0.get()

		val local_var_2_4: com.android.example.module06_module342_module3.ClassAAG = com.android.example.module06_module342_module3.ClassAAG()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString")

		for (iAb in 0..4) {
			val local_var_3_0: com.android.example.module06_module342_module3.ClassAAG = com.android.example.module06_module342_module3.ClassAAG()
			local_var_3_0.method0("SomeString", "SomeString", "SomeString")

			val local_var_3_1: com.android.example.module06_module282_module1.ClassAAG = com.android.example.module06_module282_module1.ClassAAG()
			local_var_3_1.method0(io.reactivex.subscribers.TestSubscriber(), com.android.example.module06_module342_module3.ClassAAH(), com.android.example.module06_module342_module3.ClassAAJ(), com.android.example.module06_module342_module3.ClassAAA())

			val local_var_3_2: com.android.example.module06_module282_module1.ClassAAH = com.android.example.module06_module282_module1.ClassAAH()
			local_var_3_2.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.util.LinkedArrayList(85))

		}
	}

	fun method1(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module06_module282_module1.ClassAAC = com.android.example.module06_module282_module1.ClassAAC()
		local_var_2_2.method2(com.android.example.module06_module342_module3.ClassAAD(), com.android.example.module06_module342_module3.ClassAAC())

	}

	fun method2(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module06_module282_module1.ClassAAD = com.android.example.module06_module282_module1.ClassAAD()
		local_var_2_3.method0(com.android.example.module06_module342_module3.ClassAAD())

	}

	fun method3(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module06_module282_module1.ClassAAE = com.android.example.module06_module282_module1.ClassAAE()
		local_var_2_4.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method4(
		param0: io.reactivex.observers.TestObserver<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module06_module342_module3.ClassAAA = com.android.example.module06_module342_module3.ClassAAA()
		local_var_2_4.method3("SomeString")

		param0.assertNotSubscribed()

		param0.onNext(kotlin.Any())

		val local_var_2_5: com.android.example.module06_module342_module3.ClassAAC = com.android.example.module06_module342_module3.ClassAAC()
		local_var_2_5.method2("SomeString")

	}
}
