package com.android.example.module04_module03_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module04_module12_module6.ClassAAH = com.android.example.module04_module12_module6.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module04_module12_module6.ClassAAI = com.android.example.module04_module12_module6.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module04_module12_module6.ClassAAE = com.android.example.module04_module12_module6.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module04_module12_module6.ClassAAG = com.android.example.module04_module12_module6.ClassAAG()
	private 	val instance_var_1_4: com.android.example.module04_module12_module6.ClassAAJ = com.android.example.module04_module12_module6.ClassAAJ()

	fun method0(
		param0: com.android.example.module04_module12_module6.ClassAAF,
		param1: com.android.example.module04_module12_module6.ClassAAC,
		param2: com.android.example.module04_module12_module6.ClassAAB,
		param3: com.android.example.module04_module12_module6.ClassAAA
	) {
		val local_var_2_4: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_4.isCancelled()

		listOf("1", "2", "3").forEach {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.cancel()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onNext(kotlin.Any())

		}
		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

		param0.method1("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module04_module12_module6.ClassAAF,
		param1: com.android.example.module04_module12_module6.ClassAAG,
		param2: com.android.example.module04_module12_module6.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

	}

	fun method2(
		param0: com.android.example.module04_module12_module6.ClassAAB,
		param1: com.android.example.module04_module12_module6.ClassAAE,
		param2: com.android.example.module04_module12_module6.ClassAAA,
		param3: com.android.example.module04_module12_module6.ClassAAH
	) {
	}

	fun method3(
		param0: com.android.example.module04_module12_module6.ClassAAH,
		param1: com.android.example.module04_module12_module6.ClassAAA
	) {
		param0.method0("SomeString", "SomeString")

	}
}
