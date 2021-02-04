package com.android.example.module18_module1_module24_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module18_module1_module24_module3.ClassAAC = com.android.example.module18_module1_module24_module3.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module18_module1_module24_module3.ClassAAE = com.android.example.module18_module1_module24_module3.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module18_module1_module24_module3.ClassAAE = com.android.example.module18_module1_module24_module3.ClassAAE()

	fun method0(
		param0: com.android.example.module18_module1_module24_module3.ClassAAF,
		param1: com.android.example.module18_module1_module24_module3.ClassAAB,
		param2: com.android.example.module18_module1_module24_module3.ClassAAC,
		param3: com.android.example.module18_module1_module24_module3.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		}
		for (iAb in 0..4) {
			param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		}
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}

	fun method1(
		param0: com.android.example.module18_module1_module24_module3.ClassAAA,
		param1: com.android.example.module18_module1_module24_module3.ClassAAE,
		param2: com.android.example.module18_module1_module24_module3.ClassAAI
	) {
	}
}
