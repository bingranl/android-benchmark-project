package com.android.example.module04_module03_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module04_module12_module6.ClassAAJ = com.android.example.module04_module12_module6.ClassAAJ()
	private 	val instance_var_1_1: com.android.example.module04_module12_module6.ClassAAB = com.android.example.module04_module12_module6.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module04_module12_module6.ClassAAE = com.android.example.module04_module12_module6.ClassAAE()

	fun method0(
		param0: com.android.example.module04_module12_module6.ClassAAD,
		param1: com.android.example.module04_module12_module6.ClassAAB
	) {
		param0.method3("SomeString", "SomeString")

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.clear()

		}
	}

	fun method1(
		param0: com.android.example.module04_module12_module6.ClassAAI
	) {
		param0.method0("SomeString", "SomeString")

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onComplete()

	}

	fun method2(
		param0: com.android.example.module04_module12_module6.ClassAAI,
		param1: com.android.example.module04_module12_module6.ClassAAI,
		param2: com.android.example.module04_module12_module6.ClassAAB
	) {
		param0.method0("SomeString", "SomeString")

	}
}
