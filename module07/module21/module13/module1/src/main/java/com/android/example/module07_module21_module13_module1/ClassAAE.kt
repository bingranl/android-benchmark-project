package com.android.example.module07_module21_module13_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module07_module21_module13_module5.ClassAAF = com.android.example.module07_module21_module13_module5.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module07_module21_module13_module5.ClassAAJ = com.android.example.module07_module21_module13_module5.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module07_module21_module13_module5.ClassAAI = com.android.example.module07_module21_module13_module5.ClassAAI()

	fun method0(
		param0: com.android.example.module07_module21_module13_module5.ClassAAB,
		param1: com.android.example.module07_module21_module13_module5.ClassAAA,
		param2: com.android.example.module07_module21_module13_module5.ClassAAJ
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.isDisposed()

			}
		}
	}

	fun method1(
		param0: com.android.example.module07_module21_module13_module5.ClassAAF,
		param1: com.android.example.module07_module21_module13_module5.ClassAAG,
		param2: com.android.example.module07_module21_module13_module5.ClassAAB,
		param3: com.android.example.module07_module21_module13_module5.ClassAAI
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		param0.method0("SomeString", "SomeString")

		val local_var_2_5: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_5.isCancelled()

	}

	fun method2(
		param0: com.android.example.module07_module21_module13_module5.ClassAAC
	) {
	}

	fun method3(
		param0: com.android.example.module07_module21_module13_module5.ClassAAB,
		param1: com.android.example.module07_module21_module13_module5.ClassAAB,
		param2: com.android.example.module07_module21_module13_module5.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

	}
}
