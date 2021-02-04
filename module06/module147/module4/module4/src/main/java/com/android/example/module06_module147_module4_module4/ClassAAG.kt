package com.android.example.module06_module147_module4_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module6.ClassAAD = com.android.example.module06_module147_module4_module6.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module3.ClassAAI = com.android.example.module06_module147_module4_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module147_module4_module3.ClassAAE
	) {
		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.onNext(kotlin.Any())

		for (iAb in 0..1) {
			param0.method0(com.android.example.module06_module147_module4_module6.ClassAAE(), com.android.example.module06_module147_module4_module6.ClassAAI())

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.request(-4047615431042570947)

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.isCancelled()

			val local_var_3_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_2.isDisposed()

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

	}

	fun method1(
		param0: com.android.example.module06_module147_module4_module6.ClassAAE,
		param1: com.android.example.module06_module147_module4_module3.ClassAAH
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

	}

	fun method2(
		param0: com.android.example.module06_module147_module4_module3.ClassAAE,
		param1: com.android.example.module06_module147_module4_module6.ClassAAB,
		param2: com.android.example.module06_module147_module4_module3.ClassAAA
	) {
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

	}
}
